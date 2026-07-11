/*
Structure of a Doubly LinkList
class Node {
    int data;
    Node next;
    Node prev;

    Node(int val) {
        data = val;
        next = null;
        prev = null;
    }
}
*/
class Solution {
    public Node delPos(Node head, int x) {
        if(head==null){
            return null;
        }
        if(head.next==null && x == 1){
            return null;
        }
        if(x==1){
            head=head.next;
            head.prev = null;
            return head;
        }
        Node current = head;
        for(int i = 1 ; i < x && current!=null ; i++){
            current = current.next;
        }
        if(current==null){
            return head;
        }
        current.prev.next = current.next;

        if (current.next != null) {
            current.next.prev = current.prev;
        }
        return head;
    }
}
