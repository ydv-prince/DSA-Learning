/* Structure of linked list Node
class Node {
    int data;
    Node next;

    Node(int val) {
        data = val;
        next = null;
    }
}*/

class myStack {
    Node head;
    int count;

    public myStack() {
        // Initialize your data members
        head = null;
        count = 0;
    }

    public boolean isEmpty() {
        // check if the stack is empty
        return head == null;
    }

    public void push(int x) {
        // Adds an element x at the rear of the stack.
        Node newNode = new Node(x);

        newNode.next = head;
        head = newNode;

        count++;
    }

    public void pop() {
        // Removes the front element of the stack.
        if (isEmpty()) {
           return;
       }

       head = head.next;
       count--;
    }

    public int peek() {
        // Returns the front element of the stack.
        // If stack is empty, return -1.
        if (isEmpty()) {
            return -1;
        }

        return head.data;
    }

    public int size() {
        // Returns the current size of the stack.
        return count;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna