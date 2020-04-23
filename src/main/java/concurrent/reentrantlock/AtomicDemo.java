package concurrent.reentrantlock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2020/1/11  下午3:08
 * @Version 1.0
 */
public class AtomicDemo {
    private static int count = 0;
    static Lock lock = new ReentrantLock();

    public static void inc() {
        lock.lock();
        try {
            System.out.println(count+"   "+Thread.currentThread().getName());
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        count++;
        lock.unlock();
    }

    public static void main(String[] args) throws
        InterruptedException {
        for (int i = 0; i < 1000; i++) {
            new Thread(() -> {
                AtomicDemo.inc();
            }).start();
            ;
        }
        Thread.sleep(3000);
        System.out.println("result:" + count);
    }

}