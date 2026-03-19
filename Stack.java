public class Stack {

    private int[] arr;
    private int top;
    private int capacity;

    // Constructor
    public Stack(int size) {
        capacity = size;
        arr = new int[capacity];
        top = -1;
    }

    // Push element onto stack
    public void push(int value) {

        if (top == capacity - 1) {
            System.out.println("Stack Overflow");
            return;
        }

        arr[++top] = value;
    }

    // Pop element from stack
    public int pop() {

        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }

        return arr[top--];
    }

    // Peek top element
    public int peek() {

        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }

        return arr[top];
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Get stack size
    public int size() {
        return top + 1;
    }

    // Print stack
    public void printStack() {

        for (int i = top; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }
}