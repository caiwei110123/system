package algorithm;

import sun.tools.attach.HotSpotVirtualMachine;

import java.util.HashMap;
import java.util.Map;

/**
 * 功能描述：. 重排链表
 *给定一个单链表 L：L0→L1→…→Ln-1→Ln ，
 * 将其重新排列后变为： L0→Ln→L1→Ln-1→L2→Ln-2→…
 *
 * 你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。
 *
 * 示例 1:
 *
 * 给定链表 1->2->3->4, 重新排列为 1->4->2->3.
 * 示例 2:
 *
 * 给定链表 1->2->3->4->5, 重新排列为 1->5->2->4->3.
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reorder-list
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @author : yilie
 * @date : 2020/5/2  9:30 下午
 * @Version 1.0
 */
 public    class reorderList {
    public static void main(String[] args) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        ListNode l1 = new ListNode(1);
        ListNode l11 = new ListNode(2);
        l1.next = l11;
        ListNode l111 = new ListNode(3);
        l11.next = l111;

        ListNode l1111 = new ListNode(4);
        l111.next = l1111;

        ListNode l11111 = new ListNode(5);
        l1111.next = l11111;

        ListNode l1111l1 = new ListNode(6);
        l11111.next = l1111l1;
        ListNode l1l111l1 = new ListNode(7);
        l1111l1.next = l1l111l1;

        ListNode l1l111ll1 = new ListNode(8);
        l1l111l1.next = l1l111ll1;
        ListNode l1l111lll1 = new ListNode(9);
        l1l111ll1.next = l1l111lll1;
        new reorderList().reorderList(l1);
    }

    public void reorderList(ListNode head) {
        if (head==null)
            return;
        ListNode middle=findMiddle(head);
        ListNode left=head;
        ListNode right=middle.next;
        middle.next=null;
        right=reverseList(right);
        merge(head,left,right);
        System.out.println(head.toString());
    }

    /**
     * 按题目要求合并两个链表
     * 将右链表结点依次插入左链表的结点之间
     * 给定链表 1->2->3->4->5, 重新排列为 1->5->2->4->3.
     * @param left
     * @param right
     */
    private void merge(ListNode head, ListNode left, ListNode right) {
        while (right!=null){
            ListNode tmp=right.next;
            right.next=left.next;
            left.next=right;
            left=right.next;
            right=tmp;
        }
    }

    /**
     * 利用快指针的路程是慢指针的路程的2倍，找到中心结点
     * 1     2 3 4 5 6 7 8
     * @param head
     * @return
     */
    public ListNode findMiddle(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while (fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    /**
     * 反转链表
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head) {
        ListNode cur=null;
        ListNode pre=head;

        while (pre!=null){
            ListNode tmp=pre.next;
            pre.next=cur;
            cur=pre;
            pre=tmp;
        }
        return cur;
    }
    }
