package 基础数据结构.数组.算法题.三数之和.蔡佳新;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author 蔡佳新
 * @version 1.0
 * @since 2019/11/22 16:46
 */
public class 三数之和Test {

    @Test
    public void threeSum() {
        final 三数之和 三数 = new 三数之和();
        final List<List<Integer>> lists = 三数.threeSum(new int[]{-7,-5,5,-6,-2,1,7,3,-4,-2,-2,-4,-8,-1,8,8,-2,-7,3,2,-7,8,-3,-10,5,2,8,7,7});
        System.out.println(Arrays.toString(lists.toArray()));
    }
}