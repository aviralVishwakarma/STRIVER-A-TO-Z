/*
  class Node {
   int data;
    Node next;

    Node(int d)  { data = d;  next = null; }
}
*/
class Solution {
    public boolean searchKey(Node head, int key) {
        Node current = head;
        while(current!=null){
            if(current.data==key){
                return true;
            }
            current = current.next;
        }
        return false;
    }
}
