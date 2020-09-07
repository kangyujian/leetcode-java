package basic.linkedlist;

/**
 * @author dreamcold
 * site: https://leetcode-cn.com/problems/linked-list-cycle/
 * time:2020-09-07
 */

public class LinkedListCycle {

    public boolean hasCycle(ListNode head) {
        if(head==null||head.next==null) return false;
        ListNode slow=head,fast=head.next;
        while(fast!=null){
            if(slow==fast){
                return true;
            }
            slow=slow.next;
            if(fast==null||fast.next==null) return false;
            fast=fast.next.next;

        }
        return false;
    }
}
