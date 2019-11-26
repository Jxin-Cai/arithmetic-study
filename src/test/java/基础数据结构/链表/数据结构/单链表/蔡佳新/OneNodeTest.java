package 基础数据结构.链表.数据结构.单链表.蔡佳新;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author 蔡佳新
 * @version 1.0
 * @since 2019/11/25 18:15
 */
public class OneNodeTest {

    @Test
    public void getValue() {
        final OneNode<String> oneNode = new OneNode("a");

/*        oneNode.add("b");
        oneNode.add("c");
        oneNode.add("d");*/

        oneNode.reomveEnd();

        oneNode.next().remove();

        System.out.println(oneNode.next());
    }
}