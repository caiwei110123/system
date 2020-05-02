package algorithm;

/**
 * 功能描述： 删除排序链表中的重复元素
 *给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
 *
 * 示例 1:
 *
 * 输入: 1->1->2
 * 输出: 1->2
 * 示例 2:
 *
 * 输入: 1->1->2->3->3
 * 输出: 1->2->3
 *
 * @author : yilie
 * @date : 2020/5/1  1:08 上午
 * @Version 1.0
 */
public class deleteDuplicates {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l11 = new ListNode(1);
        l1.next = l11;
        ListNode l111 = new ListNode(2);
        l11.next = l111;
        new deleteDuplicates().deleteDuplicates(l1);
    }
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        while (current != null && current.next != null) {
            if (current.next.val == current.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }

}
