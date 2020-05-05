package algorithm;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 功能描述：环形链表
 * 给定一个链表，判断链表中是否有环。
 *
 * 为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。 如果 pos 是 -1，则在该链表中没有环。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：head = [3,2,0,-4], pos = 1
 * 输出：true
 * 解释：链表中有一个环，其尾部连接到第二个节点。
 *
 *
 * 示例 2：
 *
 * 输入：head = [1,2], pos = 0
 * 输出：true
 * 解释：链表中有一个环，其尾部连接到第一个节点。
 *
 *
 * @author : yilie
 * @date : 2020/4/30  5:25 下午
 * @Version 1.0
 */
public class hasCycle {
    public static void main(String[] args) {
        for (int i = 0;i<5;) {

            System.out.println(i);
            i++;
        }






        ListNode l1 = new ListNode(3);
        ListNode l11 = new ListNode(2);
        l1.next = l11;
        ListNode l111 = new ListNode(0);
        l11.next = l111;
        ListNode l1111 = new ListNode(-4);
        l111.next = l1111;

        Set<ListNode> set = new HashSet<>();

        Iterator it =  set.iterator();
        while(it.hasNext()) {
            ListNode listNode = (ListNode)it.next();
            //System.out.println(listNode.val+"   "+ (listNode.next.val==null?"xxxx":listNode.next));
        }
        //ListNode l11111 = new ListNode(5);
        //l1111.next = l11111;

        System.out.println(new hasCycle().hasCycle(l1));

    }
    public boolean hasCycle(ListNode head) {
        Set<ListNode> nodesSeen = new HashSet<>();
        while (head != null) {
            if (nodesSeen.contains(head)) {
                return true;
            } else {
                nodesSeen.add(head);
            }
            head = head.next;
        }
        return false;
    }
}
