package concurrent.thread;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2020/1/13  下午12:51
 * @Version 1.0
 */
public class DataImportThread extends Thread {
    private CyclicBarrier cyclicBarrier;
    private String path;

    public DataImportThread(CyclicBarrier cyclicBarrier, String path) {
        this.cyclicBarrier =
            cyclicBarrier;
        this.path = path;
    }

    @Override
    public void run() {
        System.out.println("开始导入： " + path + "位置的数据");
        try {
            cyclicBarrier.await();//阻塞
            System.out.println(path+"   阻塞结束");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }
    }

}