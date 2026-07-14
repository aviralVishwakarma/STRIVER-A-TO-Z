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
        Node current = head;
        int zero = 0;
        int one  = 0;
        int two  = 0;
        while(current!=null){
            if(current.data==0){
                zero++;
            }
            else if(current.data==1){
                one++;
            }
            else{
                two++;
            }
            current=current.next;
        }
        current=head;
        while(zero-->0){
            current.data=0;
            current=current.next;
        }
        while(one-->0){
            current.data=1;
            current=current.next;
        }
        while(two-->0){
            current.data=2;
            current=current.next;
        }
        return head;
    }
}
