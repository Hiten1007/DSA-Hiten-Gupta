package Linkedlist.LinkedListQuestions;

public class IntersectionOfLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null){
            return null;
        }

        int a = 0;
        int b = 0;

        ListNode al = headA;
        ListNode bl = headB;

        while(al != null){
            al = al.next;
            a++;
        }
        while(bl != null){
            bl = bl.next;
            b++;
        }

        while(a > b){
            headA = headA.next;
            a--;
        }
        while(b > a){
            headB = headB.next;
            b--;
        }

        while(headA != headB){
            headA = headA.next;
            headB = headB.next;
        }

        return headA;
    }

    class ListNode {
        int val;
        ListNode next;

        public ListNode(){

        }
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
