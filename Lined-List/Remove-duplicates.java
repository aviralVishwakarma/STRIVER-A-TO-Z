/* Structure of a link list node
class Node {
    int data;  // value stored in node
    Node next;
    Node prev;

    Node(int value) {
        data = value;
        next = null;
        prev = null;
    }
}
*/
class Solution {
    Node removeDuplicates(Node headRef) {
        if(headRef==null && headRef.next==null){
            return headRef;
        }
        Node current = headRef.next;
        int temp = headRef.data;
        while(current!=null){
            if(current.data==temp && current.next!=null){
                current.next.prev = current.prev;
                current.prev.next = current.next;
            }
            else if(current.data==temp && current.next==null){
                current.prev.next = null;
                return headRef;
            }
            else{
                temp = current.data;
            }
            current = current.next;
        }
        return headRef;
    }
}
