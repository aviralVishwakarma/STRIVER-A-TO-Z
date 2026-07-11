/* Structure of doubly linked list node
class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
*/
class Solution {
    public Node reverse(Node head) {
        if(head==null || head.next==null){
            return head;
        }
        Node left = head;
        Node right = head;
        int count =1;
        while(right.next!=null){
            right=right.next;
            count++;
        }
        count=count/2;
        while(count-->0){
            int temp = left.data;
            left.data = right.data;
            right.data = temp;
            left=left.next;
            right=right.prev;
        }
        return head;
    }
}
