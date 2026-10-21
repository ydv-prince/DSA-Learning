/* Structure of a Node
class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}*/
class Solution {
    public boolean areIdentical(Node head1, Node head2) {
        if(head1 == null && head2 == null) return true;
        
        Node h1 = head1;
        Node h2 = head2;
        
        while(h1 != null && h2 != null){
            if(h1.data != h2.data){
                return false;
            }
            
            h1 = h1.next;
            h2 = h2.next;
        }
        
        return h1 == null && h2 == null;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna