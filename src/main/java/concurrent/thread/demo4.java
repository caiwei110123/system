package concurrent.thread;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2020/1/11  下午9:58
 * @Version 1.0
 */

import java.util.concurrent.TimeUnit;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2020/1/11  下午9:49
 * @Version 1.0
 */
public class demo4 {
    private static
    int i;

    public static void main(String[] args) throws
        InterruptedException {
        Thread
            thread = new
            Thread(() -> {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Num:" + i);
        }, "interruptDemo");
        thread.start();
        TimeUnit.SECONDS.sleep(1);
        thread.interrupt();
        System.out.println(thread.isInterrupted())
        ;
    }
}