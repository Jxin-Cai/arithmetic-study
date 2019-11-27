package 基础数据结构.数组.算法题.二数之和.wzh;
import java.util.HashMap;
import java.util.Map;

/**
 * @author : 吴志恒
 * @version :   给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * 解题思路：以hash来存储元素，一一遍历，每遍历一次，回头去map里面查找。
 * 复杂度分析：时间复杂度 O(n) 空间复杂度 O(n)
 * @date : 2019/11/26
 */
public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>(2);
        int length = nums.length;

        for (int i = 0; i < length; i++) {
            if (map.containsKey(target - nums[i])){
                return new int[]{i, map.get(target - nums[i])};
            }
            map.put(nums[i], i);
        }
        throw new RuntimeException("No solution");
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 4};
        int[] ints = TwoSum.twoSum(arr, 6);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }
}