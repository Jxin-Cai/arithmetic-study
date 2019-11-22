package 基础数据结构.数组.数据结构.CURD有序数组.wzh;

/**
 * 实现自定义数组的增删查改
 */
public interface IArrCRUD {

    /**
     * 往数组里面添加元素
     * @param element  元素
     */
     void add(int element);

    /**
     * 根据下标删除
     * @param index 下标
     */
    void delete(int index);
    /**
     * 根据下标查找
     */
    int get(int index);
    /**
     * 更新数组的元素
     */
    int update(int index, int element);
}
