/*  Structure of Linked List Node
class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
} */

class Solution {
    Node sortedMerge(Node head1, Node head2) {
        if(head1 == null) return head2;
        if(head2 == null) return head1;

        Node l1 = head1;
        Node l2 = head2;
        Node dummy = new Node(0);
        Node temp = dummy;

        while(l1 != null && l2 != null){
            if(l1.data < l2.data){
                temp.next = l1;
                temp = l1;
                l1 = l1.next;
            }
            else{
                temp.next = l2;
                temp = l2;
                l2 = l2.next;
            }
        }

        if(l1 != null){
             temp.next = l1;
        }
        else{
            temp.next = l2;
        }

        return dummy.next;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna