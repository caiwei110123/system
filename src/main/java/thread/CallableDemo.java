package thread;

import java.util.concurrent.*;

/**
 * 支付订单
 *
 * @author : yilie
 * @date : 2019/2/21  下午4:15
 * @Version 1.0
 */
public class CallableDemo implements Callable<String> {
    public static void main(String[] args) throws ExecutionException,
        InterruptedException {
        ExecutorService executorService=
            Executors.newFixedThreadPool(1);
        CallableDemo callableDemo=new CallableDemo();
        Future<String> future=executorService.submit(callableDemo);
        System.out.println(1);

        System.out.println(future.get());
        executorService.shutdown();
    }
    @Override
    public String call() throws Exception {
        int a=1;
        int b=2;
        Thread.sleep(5000);
        System.out.println(a+b);
        return "执行结果:"+(a+b);
    }
}
