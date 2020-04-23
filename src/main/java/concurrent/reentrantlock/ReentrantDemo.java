package concurrent.reentrantlock;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2020/1/11  下午3:06
 * @Version 1.0
 */
public class ReentrantDemo {
    public synchronized void demo() {
        System.out.println("begin:demo");
        demo2();
    }

    public void demo2() {
        System.out.println("begin:demo1");
        synchronized (this) {
        }
    }

    public static void main(String[] args) {
        ReentrantDemo rd = new ReentrantDemo();
        new Thread(rd::demo).start();
    }
}