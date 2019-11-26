package 基础数据结构.链表.算法题.两个有序的链表合并为一个有序链表.蔡佳新;

/**
 * @author 蔡佳新
 * @version 1.0
 * @since 2019/11/25 19:33
 */
public class 合并有序链表 {
    public class ListNode {

     int val;

     ListNode next;

     ListNode(int x) { val = x; }

    }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        }
        l2.next = mergeTwoLists(l2.next, l1);
        return l2;
    }
}
