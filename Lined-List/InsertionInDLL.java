/*
class Node
{
    int data;
    Node next;
    Node prev;
    Node(int data)
    {
        this.data = data;
        next = prev = null;
    }
}
*/

class Solution {
    Node insertAtPos(Node head, int p, int x) {
        if(head==null){
            return new Node(x);
        }
        Node current = head;
        for(int i = 0 ; i <p ; i++){
            current=current.next;
            if(current==null){
                return head;
            }
        }
        Node temp = new Node(x);
        temp.next = current.next;
        temp.prev=current;
       
        if (current.next != null) {
            current.next.prev = temp;
        }

        current.next = temp;
     return head;
}   
    }
