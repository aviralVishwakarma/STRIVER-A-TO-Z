class Solution {
    public int getLength(ListNode head) {
        int count = 1 ;
        ListNode current = head;
        while(current.next!=null){
            current = current.next;
            count++;
        }
        return count;
    }
}
