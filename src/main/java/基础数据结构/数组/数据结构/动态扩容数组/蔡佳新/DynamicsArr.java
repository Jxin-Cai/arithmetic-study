package 基础数据结构.数组.数据结构.动态扩容数组.蔡佳新;

/**
 * 动态扩容数组
 * @author 蔡佳新
 * @version 1.0
 * @since 2019/11/22 16:03
 */
public class DynamicsArr {
    /**内部数组*/
    private int[] arr = new int[3];
    /**数组长度*/
    private int len = 0;
    public void add(int element) {
        arr[len] = element;
        len++;
        if(len == arr.length){
            final int[] newArr = new int[arr.length * 2];
            System.arraycopy(arr, 0, newArr, 0, arr.length);
            arr = newArr;
        }
    }

    public int[] get(){
        final int[] result = new int[len];
        System.arraycopy(arr, 0, result, 0, len);
        return result;
    }
}
