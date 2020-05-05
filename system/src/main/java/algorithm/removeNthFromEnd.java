package algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2020/5/2  5:52 下午
 * @Version 1.0
 */
public class removeNthFromEnd {
    public static void main(String[] args) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        int n = 2;
    while (n!=0){
        System.out.println(1);
        n--;
    }
        ListNode l1 = new ListNode(1);
        ListNode l11 = new ListNode(2);
        l1.next = l11;
        ListNode l111 = new ListNode(3);
        l11.next = l111;

        ListNode l1111 = new ListNode(4);
        l111.next = l1111;

        ListNode l11111 = new ListNode(5);
        l1111.next = l11111;
        new removeNthFromEnd().removeNthFromEnd(l1,2);
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode pre = new ListNode(0);
        pre.next = head;
        ListNode start = pre, end = pre;

        while(n != 0) {
            start = start.next;
            n--;
        }
        System.out.println(start.val);
        while(start.next != null) {
            start = start.next;
            end = end.next;
        }
        end.next = end.next.next;
        return pre.next;
    }

}
