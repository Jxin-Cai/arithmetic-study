package 基础数据结构.数组.数据结构.CURD有序数组.蔡佳新;

/**
 * 有序数组
 * @author 蔡佳新
 * @version 1.0
 * @since 2019/11/21 15:34
 */
public class OrderArr implements IArrCRUD {
    /**内部数组实例*/
    private int[] arr = new int[10];
    /**当前数组个数*/
    private int len = 0;

    public OrderArr(int[] arr) {
        this.arr = arr;
        this.len = arr.length;
    }

    public OrderArr() {
    }

    public void add(int elm) {
        assert len <= 10 : "数组越界";
        final int idx = findIdx(elm);
        insetElm(elm, idx);
        len++;
    }

    public int remove(int idx) {
        assert idx < len : "数组越界";
        len--;
        final int result = arr[idx];
        for (int i = idx; i < len; i++) {
            arr[i] = arr[i + 1];
        }
        return result;
    }

    public int update(int idx, int elm) {
        final int result = remove(idx);
        add(elm);
        return result;
    }

    public int get(int idx) {
        assert idx < len : "数组越界";
        return arr[idx];
    }

    /**
     * 寻找索引位
     * @param  elm 元素
     * @return 索引位
     */
    private int findIdx(int elm){
        if(arr[0] == 0){
            return 0;
        }
        for (int i = 0; i < len; i++) {
            if(elm < arr[i]){
                continue;
            }
            return i;
        }
       return len;
    }
    private void insetElm(int elm, int offset){
        if(len == 0){
            arr[len] = elm;
            return;
        }
        for (int i = len; i > offset; i--) {
            arr[i] = arr[i - 1];
        }
        arr[offset] = elm;
    }
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            sb.append(arr[i])
              .append(",");
        }
        return sb.toString();
    }
}
