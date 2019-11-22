package 基础数据结构.数组.数据结构.动态扩容数组.蔡佳新;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * @author 蔡佳新
 * @version 1.0
 * @since 2019/11/22 16:12
 */
public class DynamicsArrTest {


    @Test
    public void get() {
        final DynamicsArr dynamicsArr = new DynamicsArr();
        dynamicsArr.add(1);
        dynamicsArr.add(2);
        dynamicsArr.add(3);
        dynamicsArr.add(4);
        System.out.println(Arrays.toString(dynamicsArr.get()));
    }
}