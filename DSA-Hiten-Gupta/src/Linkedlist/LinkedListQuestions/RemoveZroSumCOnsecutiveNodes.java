package Linkedlist.LinkedListQuestions;

public class RemoveZroSumCOnsecutiveNodes {
    public ListNode removeZroSumSublists(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode x = dummy;
        while (x != null && x.next != null) {
            if (x.next.val == 0) {
                x.next = x.next.next;
            } else {
                x = x.next;
            }
        }

        ListNode temp = dummy;
        while (temp != null && temp.next != null) {
            int sum = temp.next.val;
            ListNode t = temp.next.next;
            while (t != null) {
                sum += t.val;
                if (sum == 0) {
                    temp.next = t.next;
                    break;
                }
                t = t.next;
            }
            if (sum != 0) {
                temp = temp.next;
            }
        }

        return dummy.next;
    }
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {

        }
        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val, ListNode next) {
            this.val = val; this.next = next;
        }
    }
}

