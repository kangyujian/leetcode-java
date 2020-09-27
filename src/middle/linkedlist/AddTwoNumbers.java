package middle.linkedlist;



/**
 * @author dreamcold
 * time:2020-09-26
 * site:https://leetcode-cn.com/problems/add-two-numbers/
 */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode newNode=new ListNode(0);
        ListNode tail=newNode;
        int carry=0;
        while (l1!=null||l2!=null||carry!=0){
            int val1=l1==null?0:l1.val;
            int val2=l2==null?0:l2.val;
            int sum=val1+val2+carry;
            ListNode resNode=new ListNode(sum%10);
            tail.next=resNode;
            tail=resNode;
            carry=sum/10;
            l1=l1==null?l1:l1.next;
            l2=l2==null?l2:l2.next;

        }
        return  newNode.next;

    }
}
