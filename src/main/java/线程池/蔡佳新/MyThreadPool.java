package 线程池.蔡佳新;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author 蔡佳新
 * @version 1.0
 * @since 2019/12/10 20:12
 */
public class MyThreadPool {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.currentThread().getName());
        final BlockingQueue queue = new LinkedBlockingQueue(2);
        final MyThreadFactory factory1 = new MyThreadFactory("第一机房");
        final MyThreadFactory factory2 = new MyThreadFactory("第二机房");

        final MyRejectHandler rejectHandler = new MyRejectHandler();

        final ThreadPoolExecutor pool1 = new ThreadPoolExecutor(1,
                20,
                60,
                TimeUnit.SECONDS,
                queue,
                factory1,
                rejectHandler);
        final ThreadPoolExecutor pool2 = new ThreadPoolExecutor(1,
                20,
                60,
                TimeUnit.SECONDS,
                queue,
                factory2,
                rejectHandler);

        final Runnable task = new MyThreadFactory.Task();
        for (int i = 0; i < 20; i++) {
            pool1.submit(task);
            pool2.submit(task);
        }

        pool1.shutdown();
        pool2.shutdown();
        //Thread.sleep(10000);
    }
}
