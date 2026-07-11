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
    public ListNode middleNode(ListNode head) {
        ListNode l = head;
        ListNode r = head;
        int count = 1;
        if(head==null || head.next==null){
            return head;
        }
        while(l.next != null){
            l = l.next;
            count++;
        }
        count = count/2;
        while(count-->0){
            r = r.next;
        }
        return r;
    }
}