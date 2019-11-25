package 基础数据结构.数组.数据结构.动态扩容数组.wzh.impl;

import 基础数据结构.数组.数据结构.动态扩容数组.wzh.DynamicCapacityArr;

import java.util.Arrays;

/**
 * @author : 吴志恒
 * @version :
 * @date : 2019/11/22
 */
public class DynamicCapacityArrImpl implements DynamicCapacityArr {

    /**
     * 数组的默认初始值size为10
     */
    private int CAPACITY = 10;
    /**
     * 负载因子
     */
    private float DEFAULT_LOAD_FACTOR = 0.75f;
    /**
     * 扩容系数
     */
    private int MULTIPLE = 2;
    /**
     * 添加元素时支持动态扩容
     * @param element 元素
     */
    private int[] arr = new int[CAPACITY];

    private int length = 0;

    public DynamicCapacityArrImpl(int[] arr) {
        this.arr = arr;
        this.length = arr.length;
        this.CAPACITY = length;
    }

    public DynamicCapacityArrImpl() {
    }

    /**
     * 动态扩容
     * @param element 元素
     */
    @Override
    public void add(int element) {
        if (length >= CAPACITY * DEFAULT_LOAD_FACTOR){
            CAPACITY = CAPACITY * MULTIPLE;
            int[] newArr = new int[CAPACITY];
            System.arraycopy(arr, 0, newArr, 0, length);
            arr = newArr;
        }

        arr[length] = element;
        length ++;

    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            stringBuilder.append(arr[i]).append(",");
        }
        return stringBuilder.toString();
    }
}
