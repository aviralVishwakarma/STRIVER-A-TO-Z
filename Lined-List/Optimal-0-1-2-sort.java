/*
class Node {
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}*/

class Solution {
    public Node segregate(Node head) {
       Node zero = new Node(0);
       Node one = new Node(1);
       Node two = new Node(2);
       Node current = head;
       Node start0 = zero;
       Node start1 = one;
       Node start2 = two;
       while(current!=null){
           if(current.data==0){
               zero.next=current;
               current=current.next;
               zero = zero.next;
           }
           else if(current.data==1){
               one.next = current;
               current = current.next;
               one = one.next;
           }
           else{
               two.next = current;
               current = current.next;
               two = two.next;
           }
       }
        zero.next = (start1.next != null) ? start1.next : start2.next;
        one.next = start2.next;
        two.next = null;

        if (start0.next != null)
            return start0.next;
        if (start1.next != null)
            return start1.next;
        return start2.next;
        
    }
}
