package algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2020/5/1  9:14 上午
 * @Version 1.0
 */
public class removeElements {
    public static void main(String[] args) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();

        ListNode l1 = new ListNode(1);
        ListNode l11 = new ListNode(2);
        l1.next = l11;
        ListNode l111 = new ListNode(3);
        l11.next = l111;
        new removeElements().removeElements(l1,2);
    }
    public ListNode removeElements(ListNode head, int val) {
        ListNode sentinel = new ListNode(0);
        sentinel.next = head;
        ListNode prev = sentinel;
        ListNode cur = head;
        while(cur != null) {
            if (cur.val == val){
                prev.next = cur.next;
            }
            else{
                prev = cur;
            }
            cur = cur.next;
        }
        return sentinel.next;
    }
}
