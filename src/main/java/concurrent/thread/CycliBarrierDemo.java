package concurrent.thread;

import org.apache.commons.lang3.ThreadUtils;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2020/1/13  下午12:52
 * @Version 1.0
 */
public class CycliBarrierDemo
    extends Thread {
    @Override
    public void run() {
        System.out.println("开始进行数据分析");
    }

    public static void main(String[] args) throws InterruptedException {
        CyclicBarrier cycliBarrier = new CyclicBarrier(3, new CycliBarrierDemo());
        new Thread(new DataImportThread(cycliBarrier, "file1")).start();
        TimeUnit.SECONDS.sleep(1);
        new Thread(new DataImportThread(cycliBarrier, "file2")).start();
        TimeUnit.SECONDS.sleep(1);

        new Thread(new DataImportThread(cycliBarrier, "file3")).start();
    }

}