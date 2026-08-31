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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        if(head.next.next==null) return new int[]{-1,-1};
        ListNode current = head.next;
        ListNode prev = head;
        ListNode next = current.next;
        List<Integer> list = new ArrayList<>();
        int i = 1 ;
        while(next!=null){
            if(current.val>next.val && current.val>prev.val){
                list.add(i);
            }
            if(current.val<next.val && current.val<prev.val){
                list.add(i);
            }
            i++;
            prev = prev.next;
            current = current.next;
            next = next.next;
        }
        if(list.size()<=1) return new int[]{-1,-1};
        int max = list.get(list.size()-1)-list.get(0);
        int min = Integer.MAX_VALUE ;
        for(i = 0 ; i < list.size()-1;i++){
            min = Math.min(min,list.get(i+1)-list.get(i));
        }
        return new int[]{min,max};
    }
}