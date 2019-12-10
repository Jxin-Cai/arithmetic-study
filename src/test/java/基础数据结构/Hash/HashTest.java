package 基础数据结构.Hash;


import org.junit.Test;

/**
 * @author 蔡佳新
 * @version 1.0
 * @since 2019/12/9 19:15
 */
public class HashTest {
    @Test
    public void addTest(){


     /*   (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16)*/


        System.out.println(Integer.MAX_VALUE ^ Integer.MAX_VALUE >>> 16);
        System.out.println(1 ^ 1 >>> 16);
        System.out.println(Integer.toBinaryString(888888 ));
        System.out.println(Integer.toBinaryString(888888 >>> 1 ));
        System.out.println(Integer.toBinaryString(888888 >>> 4));
        System.out.println(Integer.toBinaryString(888888 >>> 8));
        System.out.println(Integer.toBinaryString(888888 >>> 16));
        System.out.println(888888 ^ 888888 >>> 16);
    }
}
