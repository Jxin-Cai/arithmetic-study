package 基础数据结构.数组.数据结构.CURD有序数组.蔡佳新;

/**
 * 数组增删改查
 * @author 蔡佳新
 * @version 1.0
 * @since 2019/11/21 15:35
 */
public interface IArrCRUD {
    /**
     * 添加操作(触发重排序)
     * @param  elm 元素
     */
   void add(int elm);
    /**
     * 删除操作(触发重排序)
     * @param  idx 下标
     * @return 被删除的元素
     */
   int remove(int idx);
    /**
     * 删除操作(触发重排序)
     * @param  idx 下标
     * @return 被替换的元素
     */
   int update(int idx, int elm);
    /**
     * 获取操作
     * @param  idx 下标
     * @return 指定下标的元素
     */
    int get(int idx);
}
