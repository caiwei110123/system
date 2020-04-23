package ddd.event;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2019/9/2  下午8:22
 * @Version 1.0
 */

import java.io.Serializable;
import java.util.Date;

/**
 * 领域事件
 * Created by jiangwenkang on 16-11-17.
 */
public interface DomainEvent extends Serializable {
    String occurredTime();
}