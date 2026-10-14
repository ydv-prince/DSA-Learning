/* Structure of a Linked List Node
class Node {
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}*/

class Solution {
    Node divide(Node head) {
        if (head == null || head.next == null) return head;

        Node odd = new Node(0);
        Node even = new Node(0);

        Node oddTail = odd;
        Node evenTail = even;
        Node temp = head;

        while (temp != null) {
            if (temp.data % 2 == 0) {
                evenTail.next = temp;
                evenTail = evenTail.next;
            } else {
                oddTail.next = temp;
                oddTail = oddTail.next;
            }

            temp = temp.next;
        }

        // Terminate the odd list
        oddTail.next = null;

        // Connect even nodes before odd nodes
        evenTail.next = odd.next;

        // If even nodes exist or not
        return even.next != null ? even.next : odd.next;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna