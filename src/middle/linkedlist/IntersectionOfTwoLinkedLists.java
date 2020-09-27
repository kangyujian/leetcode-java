package middle.linkedlist;

/**
 * @author dreamcold
 * time:2020-09-27
 * site:https://leetcode-cn.com/problems/intersection-of-two-linked-lists/
 */
public class IntersectionOfTwoLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA==headB){
            return headA;
        }
        if(headA==null||headB==null){
            return null;
        }
        ListNode p1=headA,p2=headB;
        while (p1!=p2){
            p1=p1==null?headB:p1.next;
            p2=p2==null?headA:p2.next;
        }
        return p1;
    }
}
