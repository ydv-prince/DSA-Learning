/*
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}
*/

class Solution {
    public Node addTwoLists(Node head1, Node head2) {
        head1 = reverse(head1);
        head2 = reverse(head2);
        
        Node dummy = new Node(0);
        Node curr = dummy;
        int carry = 0;
        
        while(head1 != null || head2 != null || carry != 0){
            int digit1 = (head1 != null) ? head1.data : 0;
            int digit2 = (head2 != null) ? head2.data : 0;
            
            int sum = digit1 + digit2 + carry;
            carry = sum / 10;
            
            Node newNode = new Node(sum % 10);
            curr.next = newNode;
            curr = curr.next;
            
            if(head1 != null) head1 = head1.next;
            if(head2 != null) head2 = head2.next;
        }

        Node res =  reverse(dummy.next);
        
        while (res != null && res.data == 0 && res.next != null) {
            res = res.next;
        }
        
        return res;
    }
    
    private Node reverse(Node head) {
        Node prev = null;
        Node curr = head;
    
        while (curr != null) {
            Node nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
    
        return prev;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna