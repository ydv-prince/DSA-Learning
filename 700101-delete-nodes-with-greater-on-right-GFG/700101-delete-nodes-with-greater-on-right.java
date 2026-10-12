/* Structure of linked list node
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
    Node compute(Node head) {
        List<Integer> values = new ArrayList<>();
        Node curr = head;

        while(curr != null){
            values.add(curr.data);
            curr = curr.next;
        }

        Deque<Integer> stack = new ArrayDeque<>();
        for(int value : values){
            while(!stack.isEmpty() && stack.peekLast() < value){
                stack.pollLast();
            }
            stack.offerLast(value);
        }

        Node dummy = new Node(0);
        Node current = dummy;

        while(!stack.isEmpty()){
            current.next = new Node(stack.pollFirst());
            current = current.next;
        }
        return dummy.next;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna