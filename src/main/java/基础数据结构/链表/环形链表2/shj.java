package 基础数据结构.链表.环形链表2;

import 基础数据结构.链表.ListNode;

/**
 * 给定一个链表，返回链表开始入环的第一个节点。 如果链表无环，则返回 null。
 * <p>
 * 为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。 如果 pos 是 -1，则在该链表中没有环。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/linked-list-cycle-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author shihj
 * @since 2019/11/26 11:26
 */
public class shj {
    public ListNode detectCycle(ListNode head) {
        ListNode node1 = head;
        ListNode node2 = head;
        ListNode node3 = head;
        while (node2 != null && node2.next != null) {
            node1 = node1.next;
            node2 = node2.next.next;
            if (node1 == node2) {
                break;
            }
        }
        while (node1 != null && node1.next != null) {
            if (node1 == node3) {
                return node1;
            }
            node1 = node1.next;
            node3 = node3.next;
        }
        return null;
    }
}
