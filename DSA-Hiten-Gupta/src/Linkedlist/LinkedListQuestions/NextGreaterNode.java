package Linkedlist.LinkedListQuestions;

public class NextGreaterNode {
    public int[] nextLargerNodes(ListNode head) {
        if(head.next == null){
            return new int[] {0};
        }
        ListNode prev = null;
        ListNode pres = head;
        ListNode next = head.next;
        int size = 1;
        while(pres != null){
            pres.next = prev;
            prev = pres;
            pres = next;
            if(next != null){
                next = next.next;
            }
            size++;
        }
        head = prev;

        int[] arr = new int[size];
        int max = head.val;
        int i = size - 1;
        while(i >= 0 && head != null){
            if(max == head.val){
                arr[i] = 0;
            }
            if(max < head.val){
                max = head.val;
            }
            else {
                arr[i] = max;
            }

            i--;
            head = head.next;
        }

        return arr;
    }
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
