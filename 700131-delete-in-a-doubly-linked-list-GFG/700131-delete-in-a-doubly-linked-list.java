/* Structure of a Doubly Linked List Node
class Node {
    int data;
    Node next;
    Node prev;

    Node(int val) {
        data = val;
        next = prev = null;
    }
}*/

class Solution {
    public Node delPos(Node head, int k) {
        Node temp = head;
        int count = 0;
        
        while(temp != null){
            count++;
            if(count == k){
                break;
            }
            temp = temp.next;
        }
        
        Node prev = temp.prev;
        Node front = temp.next;
        
        //Single element
        if(prev == null && front == null){
            return null;
        }
        
        //At head
        else if(prev == null){
            return deleteHead(head);
        }
        
        //At tail
        else if(front == null){
            return deleteTail(head);
        }
        
        //Normal middle node case
        else{
            temp.next = null;
            temp.prev = null;
            
            prev.next = front;
            front.prev = prev;
        }
        
        return head;
    }
    
    // Delete head
    Node deleteHead(Node head) {
        Node prev = head;
        head = head.next;

        head.prev = null;
        prev.next = null;

        return head;
    }
    
    // Delete tail
    Node deleteTail(Node head) {
        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        Node prev = temp.prev;
        temp.prev = null;
        prev.next = null;

        return head;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna