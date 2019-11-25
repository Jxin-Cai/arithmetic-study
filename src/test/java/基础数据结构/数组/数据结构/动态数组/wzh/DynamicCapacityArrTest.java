package 基础数据结构.数组.数据结构.动态数组.wzh;

import org.junit.Test;
import 基础数据结构.数组.数据结构.动态扩容数组.wzh.DynamicCapacityArr;
import 基础数据结构.数组.数据结构.动态扩容数组.wzh.impl.DynamicCapacityArrImpl;

/**
 * @author : 吴志恒
 * @version :
 * @date : 2019/11/22
 */
public class DynamicCapacityArrTest {


    @Test
    public void testDynamicCapacity(){
        DynamicCapacityArr dynamicCapacityArr = new DynamicCapacityArrImpl(new int[]{1,2,3,4,5,6});
        dynamicCapacityArr.add(8);
        System.out.println(dynamicCapacityArr.toString());
    }




}
