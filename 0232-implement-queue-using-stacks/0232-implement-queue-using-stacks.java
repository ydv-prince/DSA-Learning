class MyQueue {
    private Deque<Integer> inputStack = new ArrayDeque<>();
    private Deque<Integer> outputStack = new ArrayDeque<>();

    public MyQueue() {
        
    }
    
    public void push(int x) {
        inputStack.push(x);
    }
    
    public int pop() {
        transferElements();
        return outputStack.pop();
    }
    
    public int peek() {
        transferElements();
        return outputStack.peek();
    }
    
    public boolean empty() {
        return inputStack.isEmpty() && outputStack.isEmpty();
    }

    private void transferElements(){
        if(outputStack.isEmpty()){
            while(!inputStack.isEmpty()){
                outputStack.push(inputStack.pop());
            }
        }
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna