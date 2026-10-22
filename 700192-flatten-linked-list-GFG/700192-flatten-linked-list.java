/* Structure of Linked List Node
class Node {
    int data;
    Node next;
    Node bottom;

    Node(int x) {
        data = x;
        next = null;
        bottom = null;
    }
}*/

class Solution {
    public Node flatten(Node head) {
        if (head == null) {
            return null;
        }

        PriorityQueue<Node> pq =
            new PriorityQueue<>((a, b) -> Integer.compare(a.data, b.data));

        Node curr = head;

        while (curr != null) {
            pq.offer(curr);
            curr = curr.next;
        }

        Node dummy = new Node(0);
        Node tail = dummy;

        while (!pq.isEmpty()) {
            Node minNode = pq.poll();

            // Save next node in sorted list
            Node nextNode = minNode.bottom;

            // Append the minimum node
            tail.bottom = minNode;
            tail = minNode;

            // Only bottom pointers should remain in the result
            tail.next = null;

            if (nextNode != null) {
                pq.offer(nextNode);
            }
        }

        tail.bottom = null;
        return dummy.bottom;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna