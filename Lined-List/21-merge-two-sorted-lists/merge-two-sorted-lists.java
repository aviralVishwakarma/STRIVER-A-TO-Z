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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode first = list1;
        ListNode second = list2;
        if (list1 == null)
            return list2;
        if (list2 == null)
            return list1;
        ListNode prev = null;
        ListNode newHead = null;
         if (first.val <= second.val && prev == null) {
                newHead = list1;
                prev = first;
                first = first.next;
        }
        else if (second.val < first.val && prev == null) {
                newHead = list2;
                prev = second;
                second = second.next;
        }
        while (first != null && second != null) {
            if (first.val <= second.val) {
                prev.next = first;
                prev = prev.next;
                first = first.next;
            }else {
                prev.next = second;
                prev = prev.next;
                second = second.next;
            }
        }
        if (first != null)
            prev.next = first;
        else
            prev.next = second;

        return newHead;
    }
}