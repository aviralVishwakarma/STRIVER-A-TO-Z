/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null){
            return null;
        }
        ListNode dummy = new ListNode(0);
        dummy.next=head;
        ListNode back = dummy;
        ListNode front = dummy;
        int count = n+1;
        while(count-->0 && front!=null){
            front=front.next;
        }
        while(front!=null){
            front=front.next;
            back=back.next;
        }
        back.next=back.next.next;
        return dummy.next;
    }
}
/*
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null || (head.next==null && n==1)){
            return null;
        }
        int count = 0 ;
        ListNode current = head;
        while(current!=null){
            count++;
            current = current.next;
        }
        if(count==n){
            return head.next;
        }
        current = head;
        for (int i = 1; i < count - n; i++) {
            current = current.next;
        }
        current.next=current.next.next;
        return head;
    }
}
 */