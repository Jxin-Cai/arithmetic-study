package 基础数据结构.数组.数据结构.两个有序数组合并为一个有序数组.蔡佳新;

/**
 * @author 蔡佳新
 * @version 1.0
 * @since 2019/11/22 14:46
 */
public class 合并有序数组并去重 {
    private static int [] merge(int[] num1, int[] num2) {
        final int [] result = new int[num1.length + num2.length];
        int p1 = 0, p2 = 0, p = 0;
        // 双数组同时合并
        while ((p1 < num1.length) && (p2 < num1.length)){
            final int elm = (num1[p1] < num2[p2]) ? num1[p1++] : num2[p2++];
            if(p != 0 && result[p - 1] == elm){
                continue;
            }
            result[p++] = elm;
        }
        // 剩下的数组元素直接塞
        if(p1 != num1.length){
            for (int i = p1; i < num1.length; i++) {
                if(p != 0 && result[p - 1] == num1[i]){
                    continue;
                }
                result[p++] = num1[i];
            }
        }

        if(p2 != num2.length){
            for (int i = p2; i < num2.length; i++) {
                if(p != 0 && result[p - 1] == num2[i]){
                    continue;
                }
                result[p++] = num2[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        final int[] merge = merge(new int[]{1, 3, 5}, new int[]{2, 3, 6, 10, 11, 15});
        System.out.println(merge);
    }
}
