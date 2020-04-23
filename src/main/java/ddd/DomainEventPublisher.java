package ddd;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2019/9/2  下午8:23
 * @Version 1.0
 */

import ddd.event.DomainEvent;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 领域事件发布器
 * Created by jiangwenkang on 16-11-17.
 */
public class DomainEventPublisher {
    private static ConcurrentHashMap<Class<? extends DomainEvent>, List<DomainEventSubscriber<? extends DomainEvent>>> subscriberMap
        = new ConcurrentHashMap();


    public synchronized static <T extends DomainEvent> void subscribe(Class<T> domainEventClazz, DomainEventSubscriber<T> subscriber) {
        List<DomainEventSubscriber<? extends DomainEvent>> domainEventSubscribers = subscriberMap.get(domainEventClazz);
        if (domainEventSubscribers == null) {
            domainEventSubscribers = new ArrayList<DomainEventSubscriber<? extends DomainEvent>>();
        }
        domainEventSubscribers.add(subscriber);
        subscriberMap.put(domainEventClazz, domainEventSubscribers);
    }

    @SuppressWarnings("unchecked")
    public static <T extends DomainEvent> void publish(final T domainEvent) {
        if (domainEvent == null) {
            throw new IllegalArgumentException("domain event is null");
        }
        List<DomainEventSubscriber<? extends DomainEvent>> subscribers = subscriberMap.get(domainEvent.getClass());
        if (subscribers != null && !subscribers.isEmpty()) {
            for (DomainEventSubscriber subscriber : subscribers) {
                subscriber.handle(domainEvent);
            }
        }
    }


}