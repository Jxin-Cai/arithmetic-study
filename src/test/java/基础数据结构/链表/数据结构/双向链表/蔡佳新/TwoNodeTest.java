package 基础数据结构.链表.数据结构.双向链表.蔡佳新;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author 蔡佳新
 * @version 1.0
 * @since 2019/11/25 19:19
 */
public class TwoNodeTest {

    @Test
    public void getValue() {
        TwoNode twoNode = new TwoNode("a");

        twoNode.add("b");
        twoNode.add("c");
        twoNode.add("d");
        twoNode.add("e");

        twoNode.next().remove();
        twoNode.reomveEnd();
        System.out.println(twoNode);
    }
}