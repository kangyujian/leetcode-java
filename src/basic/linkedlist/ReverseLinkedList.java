package basic.linkedlist;

/**
 * @author dreamcold
 * time:2020-09-07
 * site:https://leetcode-cn.com/problems/reverse-linked-list/
 */

public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {
        ListNode newHead=new ListNode(0);
        ListNode temp=head;
        while (temp!=null){
            ListNode pTemp=temp;
            temp=temp.next;
            pTemp.next=newHead.next;
            newHead.next=pTemp;
        }
        return  newHead.next;
    }
}
