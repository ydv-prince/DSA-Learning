/* Structure of doubly linked list node
class Node {
    int data;
    Node next;
    Node prev;
    Node(int x) {
        data = x;
        next = null;
        prev = null;
    }
}
*/
class Solution {
    public Node insertInTail(Node head, int data) {
        Node curr = head;
        while(curr.next != null){
            curr = curr.next;
        }
        
        Node node = new Node(data);
        curr.next = node;
        node.prev = curr;
        
        return head;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna