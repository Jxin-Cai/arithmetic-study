package 线程池.蔡佳新;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.LongAdder;

/**
 * @author 蔡佳新
 * @version 1.0
 * @since 2019/12/10 20:14
 */
public class MyThreadFactory implements ThreadFactory {
    private final String namePre;
    private final LongAdder nextId = new LongAdder();

    public MyThreadFactory(String namePre) {
        this.namePre = namePre;
    }

    @Override
    public Thread newThread(Runnable r) {
        nextId.increment();
        final String name = namePre + nextId.longValue();
        System.out.println(name);
        return new Thread(null, r, name);

    }

    static class Task implements Runnable{
        private final AtomicInteger count = new AtomicInteger(0);
        @Override
        public void run() {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "_run :" + count.getAndIncrement());
        }
    }
}
