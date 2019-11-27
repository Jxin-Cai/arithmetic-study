package 基础数据结构.数组.数据结构.两个有序数组合并为一个有序数组.wzh;

/**
 * @author : 吴志恒
 * @version : 将两个有序的数组合并为一个有序的数组，并去重
 * @date : 2019/11/22
 */
public class MergeArr {

    /**
     * 将两个有序的数组合并
     * @param arr1 数组1
     * @param arr2 数组2
     *  思路1：将两个数组加入到一个新的数组，并排序
     *  思路2;建立一个新的数组，把左边的数组和右边的一一比较，小的就加入到新的数组中
     * @return 合并的数组
     */
    public int[] mergeArr(int[] arr1, int[] arr2){
        int leftLength = arr1.length;
        int rightLength = arr2.length;
        int[] newArr = new int[leftLength + rightLength];
        int left = 0;
        int right = 0;
        int mid = 0;
        while (left < leftLength && right < rightLength){
            int element = arr1[left] < arr2[right] ? arr1[left++] : arr2[right++];
//            if (mid != 0 && newArr[mid - 1] == element){
//                continue;
//            }
            newArr[mid++] = element;
        }
        // 哪个没塞完就全部往后面塞
        if (left != leftLength){
            System.arraycopy(arr1, left, newArr, mid, leftLength - left);
        }
        if (right != rightLength){
            System.arraycopy(arr2, right, newArr, mid, rightLength - right);
        }
        return newArr;
    }


}
