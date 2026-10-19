/* Linked List Node Structure
class Node {
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
   }
} */

class Solution {
    public Node rotate(Node head, int k) {
        if(head == null || head.next == null || k == 0) return head;
        Node currNode = head;
        int length = 0;
        
        while(currNode != null){
            length++;
            currNode = currNode.next;
        }
        
        k = k % length;
        if(k == 0) return head;
        
        Node slowPointer = head;
        Node fastPointer = head;
        
        for(int i=0; i<length - k; i++){
            fastPointer = fastPointer.next;
        }
        
        while(fastPointer.next != null){
            fastPointer = fastPointer.next;
            slowPointer = slowPointer.next;
        }
        
        Node newHead = slowPointer.next;
        slowPointer.next = null;
        fastPointer.next = head;
        
        return newHead;
    }
}



// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna