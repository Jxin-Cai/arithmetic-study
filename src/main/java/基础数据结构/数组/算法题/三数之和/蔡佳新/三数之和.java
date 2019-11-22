package 基础数据结构.数组.算法题.三数之和.蔡佳新;

import java.util.*;

/**
 * @author 蔡佳新
 * @version 1.0
 * @since 2019/11/22 16:25
 */
public class 三数之和 {

    public List<List<Integer>> threeSum(int[] nums) {
        sort(nums);
        final List<List<Integer>> result = new ArrayList<>();
        final Map<Integer, Integer> singleMap = new HashMap<>();
        for (int i = 0; i < nums.length -1; i++) {
            if(singleMap.get(nums[i]) != null){
                continue;
            }
            singleMap.put(nums[i], nums[i]);
            recursion(nums, new HashMap<>(), i, i + 1, nums.length - 1, result);
        }
        return result;
    }
    private void recursion(int[] nums,
                           Map<Integer, Boolean> booleanMap,
                           int key, int startIdx,
                           int endIdx, List<List<Integer>> result){
        // 递归终止条件
        if(startIdx >= endIdx){
            return;
        }
        final int defNum = nums[key];
        final int startNum = nums[startIdx];
        final int endNum = nums[endIdx];
        recursion(nums, booleanMap, key, startIdx + 1, endIdx, result);
        recursion(nums, booleanMap, key, startIdx , endIdx - 1, result);
        // 是否需要跳过收集
        if (needSkip(booleanMap, defNum, startNum, endNum)) return;

        result.add(Arrays.asList(defNum, startNum, endNum));
        // 赋值过滤map
        booleanMap.put(startNum, true);
        booleanMap.put(endNum, true);
    }

    /**
     * 是否需要跳过收集
     * @param  booleanMap 过滤用map
     * @param  defNum     key的元素值
     * @param  startNum   起始的元素值
     * @param  endNum     结束的元素值
     * @return 是否需要跳过收集
     */
    private boolean needSkip(Map<Integer, Boolean> booleanMap,
                             int defNum,
                             int startNum,
                             int endNum) {
        // 当前 key的组合如果成功过则跳过
        final Boolean startBo = booleanMap.get(startNum);
        final Boolean endBo = booleanMap.get(endNum);
        if(startBo!= null && startBo){
            return true;
        }
        if(endBo!= null && endBo) {
            return true;
        }

        // 不为0的组合跳过
        return defNum + startNum + endNum != 0;
    }

    /**
     * 排序
     * @param nums 数组
     * @author 蔡佳新
     */
    private void sort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if(nums[i] < nums[j]){
                    continue;
                }
                nums[i] ^= nums[j];
                nums[j] ^= nums[i];
                nums[i] ^= nums[j];
            }
        }
    }

}
