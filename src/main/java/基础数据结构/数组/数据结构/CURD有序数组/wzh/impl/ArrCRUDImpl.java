package 基础数据结构.数组.数据结构.CURD有序数组.wzh.impl;

import 基础数据结构.数组.数据结构.CURD有序数组.wzh.IArrCRUD;


/**
 * @author : 吴志恒
 * @version : 实现有序的数组 从小到大
 * @date : 2019/11/22
 */
public class ArrCRUDImpl implements IArrCRUD {

    private int SIZE = 10;
    /**
     * 数组的初始化大小为10
     */
    private int[] arr = new int[SIZE];

    private int length = 0;

    /**
     * 添加元素
     * @param element  元素
     */
    @Override
    public void add(int element) {
        assert length < SIZE : "ArrayIndexOutOfBoundsException";
        // 首先找到位置
        int index = findIndex(element);
        // 再将数组重新排序
        insertArr(index, element);
        length ++;
    }

    /**
     * 根据索引插入元素
     * @param index 索引下标
     * @param element 元素
     */
    private void insertArr(int index, int element) {
        // 第一次插入时
        if (length == 0){
            arr[index] = element;
            return;
        }
        // 都往后面移动一位，移动个数为length - index
        for (int i = length; i > index; i--) {
            arr[i] = arr[i-1];
        }
        arr[index] = element;

    }

    /**
     * 找到下标
     * @param element 元素进行排序
     * @return index
     */
    private int findIndex(int element) {
        if (length == 0){
            return 0;
        }
        for (int i = 0; i < length; i++) {
            if (element < arr[i]){
                return i;
            }
        }
        return length;
    }

    /**
     * 根据下标删除，后面的往前面移动 移动位数为length -1 -index
     * @param index 下标
     */
    @Override
    public void delete(int index) {
        if (index >= length){
            throw new RuntimeException("ArrayIndexOutOfBoundsException");
        }
        for (int i = index; i < length-1; i++) {
            arr[i] = arr[i + 1];
        }
        length --;
    }

    @Override
    public int get(int index) {
        if (index >= length){
            throw new RuntimeException("ArrayIndexOutOfBoundsException");
        }
        return arr[index];
    }

    /**
     * 更新数组的元素
     * @param index 下标
     * @param element 元素
     * @return 先删除再插入
     */
    @Override
    public int update(int index, int element) {
        if (index >= length){
            throw new RuntimeException("ArrayIndexOutOfBoundsException");
        }
        int tmp = arr[index];
        delete(index);
        add(element);
        return tmp;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            builder.append(arr[i]).append(",");
        }
        return builder.toString();
    }

}
