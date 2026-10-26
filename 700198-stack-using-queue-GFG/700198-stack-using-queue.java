class myStack {
    Queue<Integer> q = new LinkedList<>();

    void push(int x) {
        // Inserts an element x at the top of the stack
        q.add(x);
        int sz = q.size();
        
        for(int i=0; i<sz-1; i++){
            q.add(q.peek());
            q.poll();
        }
    }

    void pop() {
        // Removes an element from the top of the stack
        if(!q.isEmpty()){
            q.poll();
        }
    }

    int top() {
        // Returns the top element of the stack
        // If stack is empty, return -1
        if(!q.isEmpty()){
            return q.peek();
        }
        return -1;
    }

    int size() {
        // Returns the current size of the stack
        return q.size();
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna