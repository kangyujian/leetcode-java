package basic.linkedlist;

/**
 * @author dreamcold
 * site:https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list/
 * time:2020-09-07
 */
public class RemoveNthNodeFromEndOfList {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if (head==null||head.next==null){
            return null;
        }

        ListNode fast=head,slow=head;
        int count=0;
        while (count<n&&fast!=null){
            count++;
            fast=fast.next;
        }

        if(fast==null){
            return head.next;
        }

        while (fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }

        slow.next=slow.next.next;
        return head;
    }
}
