package 基础数据结构.链表.环形链表;

import 基础数据结构.链表.ListNode;

/**
 * 给定一个链表，判断链表中是否有环。
 * <p>
 * 为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。 如果 pos 是 -1，则在该链表中没有环。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/linked-list-cycle
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author shihj
 * @since 2019/11/26 10:49
 */
public class shi {
    public boolean hasCycle(ListNode head) {
        ListNode node1 = head;
        ListNode node2 = head;
        while (node2 != null && node2.next != null) {
            node1 = node1.next;
            node2 = node2.next.next;
            if (node1 == node2) {
                return true;
            }
        }
        return false;
    }
}
