package middle.linkedlist;

/**
 * @author dreamcold
 * time:2020-09-26
 * site:https://leetcode-cn.com/problems/odd-even-linked-list/
 */
public class OddEvenLinkedList {

    public ListNode oddEvenList(ListNode head) {
        if(head==null) return null;
        int index=1;
        ListNode dummyNode1=new ListNode(-1);
        ListNode dummyNode2=new ListNode(-1);
        ListNode p=head,p1=dummyNode1,p2=dummyNode2;
        while (p!=null){
            if(index%2==1){
                p1.next=p;
                p1=p1.next;
            }else{
                p2.next=p;
                p2=p2.next;
            }
            index++;
            p=p.next;
        }
        p2.next=null;
        p1.next=dummyNode2.next;
        return dummyNode1.next;
    }
}
