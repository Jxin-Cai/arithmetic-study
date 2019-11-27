package 基础数据结构.数组.算法题.三数之和.wzh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

/**
 * @author : 吴志恒
 * @version : 三数之和
 * 解题思路：1、先对数组排序
 * 2、首先固定一个数k，从0到length -2，将两个指针，开始从左、右两边开始移动
 * 3、固定位如果相同，则跳过，接着往下面走
 * @date : 2019/11/26
 */
public class ThreeSum {

    public static List<List<Integer>> threeSum(int[] arr) {
        List<List<Integer>> resultList = new ArrayList<>();

        Arrays.sort(arr);
        int count= 0;
        for (int k = 0; k < (arr.length - 2); k++) {
            // 如果最小的值大于0，则没有符合的记录
            if (arr[k] > 0) {
                break;
            }
            if (k > 0 && arr[k] == arr[k - 1]) {
                continue;
            }
            int i = k + 1;
            int j = arr.length - 1;
//            int a = arr[i];
//            int b = arr[j];
            while (i < j) {
                int sum = arr[k] + arr[i] + arr[j];
                // 如果相加是小于0，则往后面移，使相加的结果向0靠拢
                if (sum < 0) {
                    while (i < j && arr[i] == arr[++i]){ }
                } else if (sum > 0) {
                    while (i < j && arr[j] == arr[--j]){ }
                } else {
                    resultList.add(new ArrayList<>(Arrays.asList(arr[k], arr[i], arr[j])));
                    while (i < j && arr[i] == arr[++i]){ }
                    while (i < j && arr[j] == arr[--j]){ }
                }
            }
        }
        return resultList;
    }

    public static void main(String[] args) {
        int[] arr = {-1, -4, -6, 1, 0, 1, 1,2, 2, 3};
        System.out.println(ThreeSum.threeSum(arr));
    }

}
