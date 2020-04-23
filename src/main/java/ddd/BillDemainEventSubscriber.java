package ddd;

import ddd.event.DomainEvent;

import java.util.Date;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2019/9/2  下午8:28
 * @Version 1.0
 */
public class BillDemainEventSubscriber implements DomainEventSubscriber {
    @Override
    public void handle(DomainEvent event) {
        String date = event.occurredTime();
        if (date=="order") {
            System.out.println(date);
        } else {
            System.out.println(0);
        }

    }
}
