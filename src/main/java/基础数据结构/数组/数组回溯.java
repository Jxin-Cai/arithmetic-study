package 基础数据结构.数组;

/**
 * todo:desc
 *
 * @author shihj
 * @since 2019/11/21 18:27
 */
public class 数组回溯 {

    public static void main(String[] args) {
        int[] a1 = {1, 2, 3, 6};
        int[] a2 = {2, 4, 7, 10};
        int[] res = new int[a1.length * 2];
        getMinResult(res, a1, a2, 0, 0, 0);
        for (int i = 0; i < result.length; i++) {
            System.out.println("最终结果数组：" + result[i]);
        }
        System.out.println("最终结果之和：" + getMultiply(result));
    }

    static int result[];
    static int minSum = Integer.MAX_VALUE;

    private static void getMinResult(int res[], int a1[], int a2[], int index, int index1, int index2) {
        if (index == a1.length * 2) {
            setResult(res);
            return;
        }
        if (index1 == a1.length) {
            for (int i = index2; i < a2.length; i++) {
                res[index] = a2[i];
                index++;
            }
            setResult(res);
            return;
        }

        if (index2 == a2.length) {
            for (int i = index1; i < a1.length; i++) {
                res[index] = a1[i];
                index++;
            }
            setResult(res);
            return;
        }
        for (int i = 0; i < 2; i++) {
            if (i == 0) {
                res[index] = a1[index1];
                getMinResult(res, a1, a2, ++index, ++index1, index2);
                index--;
                index1--;
            } else {
                res[index] = a2[index2];
                getMinResult(res, a1, a2, ++index, index1, ++index2);
                index--;
                index2--;
            }
        }
    }

    private static void setResult(int res[]) {
        if (getMultiply(res) < minSum) {
            result = new int[res.length];
            minSum = getMultiply(res);
            for (int i = 0; i < res.length; i++) {
                result[i] = res[i];
            }
        }
        System.out.println("过程结果:" + getMultiply(res));
    }

    private static int getMultiply(int result[]) {
        int sum = 0;
        for (int i = 0; i < result.length; ) {
            sum = sum + result[i] * result[i + 1];
            i = i + 2;
        }
        return sum;
    }


}
