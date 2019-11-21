package 基础数据结构.数组.数据结构.CURD有序数组.蔡佳新;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author 蔡佳新
 * @version 1.0
 * @since 2019/11/21 17:36
 */
public class OrderArrTest {

    @Test
    public void add() {
        final OrderArr orderArr = new OrderArr();
        orderArr.add(5);
        orderArr.add(3);
        orderArr.add(6);
        orderArr.add(9);
        orderArr.add(11);
        orderArr.add(19);
        orderArr.add(10);
        orderArr.add(10);
        orderArr.add(10);
        orderArr.add(120);
       // orderArr.add(121);
        System.out.println(orderArr);
    }

    @Test
    public void remove() {
        final OrderArr orderArr = new OrderArr(new int[]{120,19,11,10,10,10,9,6,5,3});
        final int remove = orderArr.remove(2);
        System.out.println(remove);
        System.out.println(orderArr);
    }

    @Test
    public void update() {
        final OrderArr orderArr = new OrderArr(new int[]{120,19,11,10,10,10,9,6,5,3});
        final int update = orderArr.update(9, 4);
        System.out.println(update);
        System.out.println(orderArr);
    }

    @Test
    public void get() {
        final OrderArr orderArr = new OrderArr(new int[]{120,19,11,10,10,10,9,6,5,3});
        System.out.println(orderArr.get(11));
    }

}