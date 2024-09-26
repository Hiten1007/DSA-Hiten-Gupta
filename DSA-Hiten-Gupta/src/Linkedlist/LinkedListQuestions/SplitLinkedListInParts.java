package Linkedlist.LinkedListQuestions;

import java.util.ArrayList;

public class SplitLinkedListInParts {
    public ListNode[] splitListToParts(ListNode head, int k) {
        int size = getSize(head);
        ListNode[] res = new ListNode[k];
        int rem = size % k;
        int div = size / k;

        ListNode temp = head;

        for (int i = 0; i < k; i++) {

            res[i] = temp;

            if (temp == null) {
                break;
            }

            int total = div;
            if (rem > 0) {
                total += 1;
                rem--;
            }

            for (int j = 0; j < total - 1; j++) {
                temp = temp.next;
            }
            ListNode t1 = temp.next;
            temp.next = null;
            temp = t1;

        }
        return res;
    }
    public int getSize(ListNode head){
        ListNode temp = head;
        int size = 0;
        while(temp != null){
            temp = temp.next;
            size++;
        }
        return size;
    }
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
