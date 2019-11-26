package 基础数据结构.链表.删除链表倒数第N个元素;

/**
 * 给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
 *
 * 示例：
 *
 * 给定一个链表: 1->2->3->4->5, 和 n = 2.
 *
 * 当删除了倒数第二个节点后，链表变为 1->2->3->5.
 * 说明：
 *
 * 给定的 n 保证是有效的。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list
 *
 * @author shihj
 * @since 2019/11/26 9:45
 */
public class shj {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr = head;
        ListNode node = head;
        for (int i = 0; i < n; i++) {
            curr = curr.next;
        }
        if (curr == null) {
            head = node.next;
        }
        while (curr != null) {
            if (curr.next == null) {
                node.next = node.next.next;
                break;
            }
            curr = curr.next;
            node = node.next;
        }
        return head;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
