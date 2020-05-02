package algorithm;

/**
 * 功能描述：反转链表
 *反转一个单链表。
 *
 * 示例:
 *
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 *
 * 进阶:
 * 你可以迭代或递归地反转链表。你能否用两种方法解决这道题？
 * @author : yilie
 * @date : 2020/4/30  11:09 上午
 * @Version 1.0
 */
public class reverseList {

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        System.out.println(prev);
        return prev;
    }

    public ListNode reverseList1(ListNode head) {
       if (head == null || head.next == null) {
           return head;
       }
       ListNode p = reverseList1(head.next);
       head.next.next = head;
       head.next = null;
        return p;
    }
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l11 = new ListNode(2);
        l1.next = l11;
        ListNode l111 = new ListNode(3);
        l11.next = l111;
        ListNode l1111 = new ListNode(4);
        l111.next = l1111;

        ListNode l11111 = new ListNode(5);
        l1111.next = l11111;

        System.out.println(new reverseList().reverseList1(l1));

    }
}
