package Linkedlist.LinkedListQuestions;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;

        ListNode head = new ListNode(l1.val + l2.val);
        ListNode temp = head;

        if(head.val >= 10){
            carry = 1;
            head.val = head.val % 10;
        }


        l1 = l1.next;
        l2 = l2.next;

        while(l1 != null && l2 != null){
            int sum = l1.val + l2.val + carry;

            if(sum >= 10){
                carry = 1;
                temp.next = new ListNode(sum%10);
                temp = temp.next;
            }
            else{
                carry = 0;
                temp.next = new ListNode(sum);
                temp = temp.next;
            }
            l1 = l1.next;
            l2 = l2.next;
        }

        ListNode remain = (l1!=null) ? l1 : l2;

        while(remain != null){
            int sum = remain.val + carry;

            if(sum > 9){
                temp.next = new ListNode(sum % 10);
                carry = 1;
            }
            else{
                carry = 0;
                temp.next = new ListNode(sum);
            }
            temp = temp.next;
            remain = remain.next;
        }



        temp.next = null;

        if(carry == 1){
            temp.next = new ListNode(1, null);
        }

        return head;

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
        ListNode(int x, ListNode next) {
            val = x;
            next = null;
        }
    }
}
