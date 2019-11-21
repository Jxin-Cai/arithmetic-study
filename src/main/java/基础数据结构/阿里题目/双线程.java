package 基础数据结构.阿里题目;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author 蔡佳新
 * @version 1.0
 * @since 2019/11/21 18:49
 */
public class 双线程 {
    public static void main(String[] args) {
        final 双线程 双 = new 双线程();
        双.start();
    }
    //任务队列
    final BlockingQueue<Integer> bq = new LinkedBlockingQueue<>(100);
    //执行批量任务
    private void start() {
        final ExecutorService pool = Executors.newFixedThreadPool(2);
        pool.execute(this::producer);
        pool.execute(this::consume);
        pool.shutdown();
        while(!pool.isTerminated()){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.err.println("续航失败");
            }
        }
    }
    private void producer(){
        for (int i = 1; i <= 100 ; i++) {
            try {
                bq.put(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    private void consume() {
        try {
            int sum = 0;
            while (true) {
                // 获取批量任务
                final List<Integer> numList = pollTasks();
                // 执行批量任务
                for (Integer num : numList) {
                    System.out.println(sum += num);
                    if(num == 100){
                        return;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //从任务队列中获取批量任务
    private List<Integer> pollTasks() throws InterruptedException{
        final List<Integer> result = new LinkedList<>();
        // 阻塞式获取一条任务
        Integer num = bq.take();
        while (num != null) {
            result.add(num);
            // 非阻塞式获取一条任务
            num = bq.poll();
        }
        return result;
    }
}
