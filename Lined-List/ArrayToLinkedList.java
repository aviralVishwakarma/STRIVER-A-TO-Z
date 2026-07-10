/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/
class Solution {
    public Node insertAtEnd(Node head, int x) {
        if (head == null) {
            return new Node(x);
        }
        Node current = head;
        while(current.next!=null){
            current = current.next;
        }
        Node a = new Node(x);
        current.next = a;
        return head;
        
    }
}
