package basic.linkedlist;


/**
 * @author dreamcold
 * site:https://leetcode-cn.com/problems/palindrome-linked-list/
 * time:2020-09-07
 */

public class PalindromeLinkedList {
    private ListNode findMid(ListNode head) {
        ListNode fast = head, slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    private ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode mid = findMid(head);
        ListNode newHead = reverse(mid);
        while (newHead != null) {
            if (head.val != newHead.val) {
                return false;
            }
            head = head.next;
            newHead = newHead.next;
        }
        return true;
    }



}
