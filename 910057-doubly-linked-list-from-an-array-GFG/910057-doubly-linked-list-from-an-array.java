/* class Node {
    int data;
    Node next;
    Node prev;

    Node(int d) {
        data = d;
        next = null;
        prev = null;
    }
} */

class Solution {
    public Node createDLL(int arr[]) {
        if(arr.length == 0) return null;
        
        Node head = new Node(arr[0]);
        Node prev = head;
        
        for(int i=1; i<arr.length; i++){
            Node curr = new Node(arr[i]);
            
            prev.next = curr;
            curr.prev = prev;
            
            prev = curr;
        }
        return head;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna