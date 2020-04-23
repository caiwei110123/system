package concurrent.thread;

import java.util.concurrent.CountDownLatch;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2020/1/13  上午7:30
 * @Version 1.0
 */
public class CountDownLatchTest extends Thread{
    static CountDownLatch
        countDownLatch = new CountDownLatch(1);

    @Override
    public void run() {
        try {
            countDownLatch.await();
            //TODO
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
            //TODO
        System.out.println("ThreadName:" + Thread.currentThread().getName());
    }

    public static void main(String[]
                                args) throws InterruptedException {
        for (int i = 0; i < 1000; i++) {
            new CountDownLatchTest().start();
        }
        Thread.sleep(1000);
        countDownLatch.countDown();

    }
}
