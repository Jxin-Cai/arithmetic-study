package 基础数据结构.阿里题目;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;

/**
 * todo:desc
 *
 * @author shihj
 * @since 2019/11/21 18:40
 */
public class 双工死循环 {
    private static ConcurrentHashMap<Integer, Integer> map = new ConcurrentHashMap(100);
    private static int n = 100;

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new Runnable() {
            public void run() {
                for (int i = 1; i <= n; i++) {
                    map.put(i, i);
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            public void run() {
                int sum = 0;
                for (int i = 1; i <= n; i++) {
                  Integer num = null;
                    final long start = System.currentTimeMillis();
                    while (num == null && System.currentTimeMillis() - start < 1000){
                       num = map.get(i);
                   }
                    System.out.println(sum += num);
                }
            }
        });
        thread1.start();
        thread2.start();
    }

}
