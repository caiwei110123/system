package concurrent.thread;

import java.util.concurrent.TimeUnit;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2020/1/11  下午9:49
 * @Version 1.0
 */
public class InterruptDemo3 {
    private static
    int i;

    public static void main(String[]
                                args) throws
        InterruptedException {
        Thread
            thread = new
            Thread(() -> {
            while (!Thread.currentThread().isInterrupted()) {
                i++;
            }
            System.out.println("1    "+Thread.currentThread().isInterrupted());

            System.out.println("Num:" + i);
        }, "interruptDemo");
        thread.start();
        TimeUnit.SECONDS.sleep(1);
        System.out.println(thread.isInterrupted());
        thread.interrupt();
        System.out.println(thread.isInterrupted());
    }
}