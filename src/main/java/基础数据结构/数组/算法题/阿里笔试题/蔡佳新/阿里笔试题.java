package 基础数据结构.数组.算法题.阿里笔试题.蔡佳新;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 蔡佳新
 * @version 1.0
 * @since 2019/11/21 16:04
 */
public class 阿里笔试题 {
    public static void main(String[] args) {
        mergeArr(new int[]{1, 3, 5, 7}, new int[]{2,4,6,8});
    }
    private static void mergeArr(int[] a, int[]b){
        final List<int[]> result = new ArrayList<int[]>();
        final int len = a.length + b.length;
        merge(a, 0, b, 0,  new int[len], 0, len,  result);
        System.out.println(minSumFromList(result));

    }
    private static int minSumFromList(List<int[]> allArr){
        int result = Integer.MAX_VALUE;
        for (int[] ints : allArr) {
            int sum = 0;
            for (int i = 0; i < ints.length - 1; i+=2) {
                sum += ints[i] * ints[i + 1];
            }
            if(sum < result){
                result = sum;
            }
        }
        return result;
    }
    private static void merge(int[] a, int aOffset,
                              int[] b, int bOffset,
                              int[] def , int dOffset,
                              int len, List<int[]> allArr){
        if(dOffset == len){
            allArr.add(def);
            return;
        }
       final int[] mergeA  = def.clone();
       final int[] mergeB  = def.clone();
        if(aOffset < a.length){
            mergeA[dOffset] = a[aOffset];
            merge(a, aOffset + 1, b, bOffset, mergeA, dOffset + 1, len, allArr);
        }

        if(bOffset < b.length){
            mergeB[dOffset] = b[bOffset];
            merge(a, aOffset, b, bOffset + 1, mergeB, dOffset + 1, len, allArr);
        }
    }
}
