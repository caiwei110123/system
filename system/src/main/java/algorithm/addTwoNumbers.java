package algorithm;

/**
 * 功能描述：两数相加
 *给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 *
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 *
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 *
 * 示例：
 *输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 * @author : yilie
 * @date : 2020/4/30  8:25 上午
 * @Version 1.0
 */
public class addTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p = l1;
        ListNode q = l2;
        ListNode result = new ListNode(0);
        ListNode current = result;
        int carry = 0;
        while(p != null || q != null) {
            int x = 0;
            int y = 0;
            if (p != null) {
                x = p.val;
            }
            if (q != null) {
                y = q.val;
            }
            int sum = carry + x + y;
            carry = sum / 10 ;
            current.next = new ListNode(sum % 10);
            current = current.next;
            if (p != null) {
                p = p.next;
            }
            if (q != null) {
                q = q.next;
            }
        }
        if (carry > 0) {
            current.next = new ListNode(carry);
        }
        return  result.next;
    }
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        ListNode l11 = new ListNode(4);
        l1.next = l11;
        ListNode l111 = new ListNode(3);
        l11.next = l111;


        ListNode l2 = new ListNode(5);
        ListNode l22 = new ListNode(6);
        l2.next = l22;
        ListNode l222 = new ListNode(4);
        l22.next = l222;
        System.out.println("result    ="+new addTwoNumbers().addTwoNumbers(l1,l2));

    }
}
