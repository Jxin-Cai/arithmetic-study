package 基础数据结构.数组.数据结构.CURD有序数组.wzh;

import org.junit.Test;
import 基础数据结构.数组.数据结构.CURD有序数组.wzh.impl.ArrCRUDImpl;

/**
 * @author : 吴志恒
 * @version :
 * @date : 2019/11/22
 */
public class ArrTest {

    @Test
    public void addTest(){
        IArrCRUD arrCRUD = new ArrCRUDImpl();
        arrCRUD.add(11);
        arrCRUD.add(2);
        arrCRUD.add(3);
        arrCRUD.add(42);
        arrCRUD.add(5);
        arrCRUD.add(21);
        arrCRUD.add(7);
        arrCRUD.add(8);
        arrCRUD.add(8);
        arrCRUD.add(8);
        arrCRUD.add(21);
        System.out.println(arrCRUD.toString());
    }

    @Test
    public void testDelete(){
        IArrCRUD arrCRUD = new ArrCRUDImpl();
        arrCRUD.add(11);
        arrCRUD.add(2);
        arrCRUD.add(3);
        arrCRUD.add(42);
        arrCRUD.add(5);
        arrCRUD.add(21);
        System.out.println("数组：start:" + arrCRUD.toString());
        arrCRUD.delete(5);
        System.out.println("数组：end:" + arrCRUD.toString());

    }

    @Test
    public void testUpdate(){
        IArrCRUD arrCRUD = new ArrCRUDImpl();
        arrCRUD.add(11);
        arrCRUD.add(2);
        arrCRUD.add(3);
        arrCRUD.add(42);
        arrCRUD.add(5);
        arrCRUD.add(21);
        arrCRUD.update(1, 10);
        System.out.println("数组：start:" + arrCRUD.toString());
        System.out.println(arrCRUD.get(2));

    }

}
