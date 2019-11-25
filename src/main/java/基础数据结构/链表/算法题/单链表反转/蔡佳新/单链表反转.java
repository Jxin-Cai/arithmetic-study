package 基础数据结构.链表.算法题.单链表反转.蔡佳新;

import 基础数据结构.链表.算法题.两个有序的链表合并为一个有序链表.蔡佳新.合并有序链表;

/**
 * @author 蔡佳新
 * @version 1.0
 * @since 2019/11/25 20:13
 */
public class 单链表反转 {
    public class ListNode {

        int val;

        ListNode next;

        ListNode(int x) { val = x; }

    }
    public ListNode reverseList(ListNode head) {
        ListNode pre =  null;
        while (head != null){
            ListNode next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }

/*    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode result = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return result;
    }*/
}
