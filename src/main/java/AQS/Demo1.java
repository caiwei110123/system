package AQS;

import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 支付订单
 *
 * @author : yilie
 * @date : 2019/2/27  上午10:15
 * @Version 1.0
 */
public class Demo1 extends  Thread{

    private  Lock lock;
    private Condition condition;

    @Override
    public void run(){
        try {
            condition.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    public static void main(String[] args) {
        AbstractQueuedSynchronizer a = null;
       // Lock lock = new ReentrantLock();
      //  lock.lock();lock.unlock();





    }
}
