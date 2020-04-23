package concurrent.thread;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2020/1/13  下午12:37
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Semaphore semaphore=new Semaphore(5);
        for(int i=0;i<10;i++){
            new Car(i,semaphore).start();
        }
    }
    static class Car extends Thread{
        private int num;
        private Semaphore semaphore;
        public Car(int num, Semaphore
            semaphore) {
            this.num = num;
            this.semaphore = semaphore;
        }
        public void run(){
            try {
                semaphore.acquire();//获取一个许可
                System.out.println("第"+num+"占用 一个停车位");
                TimeUnit.SECONDS.sleep(4);
                    System.out.println("第"+num+"俩车走喽");
                        semaphore.release();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}