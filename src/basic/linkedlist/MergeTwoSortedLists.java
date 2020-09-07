package basic.linkedlist;

/**
 * @author dreamcold
 * time:2020-09-07
 * site:https://leetcode-cn.com/problems/merge-two-sorted-lists/
 */

public class MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode t1=l1,t2=l2;
        ListNode resHead=new ListNode(0);
        ListNode tail=resHead;
        while (t1!=null&&t2!=null){
            if(t1.val<t2.val){
                tail.next=t1;
                tail=t1;
                t1=t1.next;
            }else {
                tail.next=t2;
                tail=t2;
                t2=t2.next;
            }
        }
        if(t1!=null){
            tail.next=t1;
        }
        if(t2!=null){
            tail.next=t2;
        }
        return resHead.next;
    }
}
