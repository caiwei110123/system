package concurrent.thread;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2020/1/11  下午9:33
 * @Version 1.0
 */
public class InterruptDemo1 {
    private static int i;
    Condition c = null;
    public static void main(String[] args) throws
        InterruptedException {
        Thread thread = new
            Thread(() -> {
            while (true) {
                if (Thread.currentThread().isInterrupted()) {
                    System.out.println("before:" + Thread.currentThread().isInterrupted());

                    Thread.interrupted(); //对线程进行复位，由 true 变成 false

                    System.out.println("after:" + Thread
                        .currentThread().isInterrupted());
                    System.out.println("----------");

                    Thread.interrupted(); //对线程进行复位，由 true 变成 false

                    System.out.println("after:" + Thread
                        .currentThread().isInterrupted());
                }
            }
        }, "interruptDemo");
        thread.start();
        System.out.println(Thread.currentThread().isInterrupted());
        TimeUnit.SECONDS.sleep(1);
        thread.interrupt();
    }
}