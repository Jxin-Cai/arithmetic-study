package 基础数据结构.链表.合并两个有序链表;

import 基础数据结构.链表.ListNode;

/**
 * 将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 
 * <p>
 * 示例：
 * <p>
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/merge-two-sorted-lists
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author shihj
 * @since 2019/11/25 19:10
 */
public class shj {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(4);
        l1.next = l2;
        l2.next = l3;
    }

    public ListNode middleNode(ListNode head) {
        ListNode node = head;
        ListNode curr = head;
        while (curr != null && curr.next != null) {
            node = node.next;
            curr = curr.next.next;
        }
        return node;
    }
}




