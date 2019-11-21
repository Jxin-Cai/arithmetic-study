package 基础数据结构.阿里题目;

import java.util.HashMap;
import java.util.concurrent.*;
import java.util.concurrent.atomic.LongAdder;

/**
 * todo:desc
 *
 * @author shihj
 * @since 2019/11/21 18:40
 */
public class 有先后顺序的双工死循环 {
    private static HashMap<String, Integer> map = new HashMap(1);
    private static String key = "key";
    private static int n = 100;
    private static int sum = 0;
    private static volatile boolean consume = false;
    public static void main(String[] args) throws InterruptedException {
        final ExecutorService pool = Executors.newFixedThreadPool(2);
        pool.execute(new Runnable() {
            public void run() {
                for (int i = 1; i <= n; i++) {
                    if (!consume){
                        map.put(key, i);
                        consume = true;
                        continue;
                    }
                    i--;
                }
            }
        });
        pool.execute(new Runnable() {
            public void run() {
                for (int i = 1; i <= n; i++) {
                    if (consume){
                        System.out.println(sum += map.get(key));
                        consume = false;
                        continue;
                    }
                    i--;
                }
            }
        });
        pool.shutdown();
        while(!pool.isTerminated()){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.err.println("续航失败");
            }
        }
    }
}
