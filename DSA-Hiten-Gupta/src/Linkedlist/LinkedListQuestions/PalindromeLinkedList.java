package Linkedlist.LinkedListQuestions;

import Linkedlist.LL;

import java.util.List;

public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        ListNode mid = middleNode(head);
        ListNode headSecond = reverseList(mid);
        ListNode rereversehead = headSecond;

        while(head != null && head.next != null){
            if(head.val != headSecond.val){
                break;
            }
            head = head.next;
            headSecond = headSecond.next;
        }
        reverseList(rereversehead);
        if(head == null || headSecond == null) return true;
        return false;
    }

    static ListNode middleNode(ListNode head) {
         ListNode slow = head;
         ListNode fast = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode pres = head;
        ListNode nexts = (pres != null) ? pres.next : null;

        while(pres != null){
            pres.next = prev;
            prev = pres;
            pres = nexts;
            if(nexts != null) {
                nexts = nexts.next;
            }
        }
        head = prev;
        return head;
    }

    class ListNode {
        int val;
       ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
