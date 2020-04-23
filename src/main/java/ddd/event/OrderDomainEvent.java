package ddd.event;

import ddd.event.DomainEvent;

import java.util.Date;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2019/9/2  下午8:29
 * @Version 1.0
 */
public class OrderDomainEvent implements DomainEvent {
    @Override
    public String occurredTime() {
        System.out.println("ok");
        return  "order";
    }
}
