package ddd;

import ddd.event.DomainEvent;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2019/9/2  下午8:23
 * @Version 1.0
 */
public interface DomainEventSubscriber<T extends DomainEvent> {

    /**
     * 订阅者处理事件
     *
     * @param event 领域事件
     */
    void handle(T event);
}