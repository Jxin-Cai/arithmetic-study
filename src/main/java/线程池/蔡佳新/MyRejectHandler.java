package 线程池.蔡佳新;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author 蔡佳新
 * @version 1.0
 * @since 2019/12/10 20:11
 */
public class MyRejectHandler implements RejectedExecutionHandler {
    @Override
    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
        System.out.println(executor.toString());
        //System.out.println(Thread.currentThread().getName());
        //r.run();
    }
}
