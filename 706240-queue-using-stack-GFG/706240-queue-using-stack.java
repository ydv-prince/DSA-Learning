class myQueue {

    // Initialize your data members
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    void enqueue(int x) {
        // Implement enqueue operation
        s1.push(x);
    }

    void dequeue() {
        // Implement dequeue operation
        if(s1.isEmpty() && s2.isEmpty()){
            return;
        }
        
        if(s2.isEmpty()){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
        }
        
        s2.pop();
    }

    int front() {
        // Implement front operation
        if(!s2.isEmpty()){
            return s2.peek();
        }
        
        if(!s1.isEmpty()){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            return s2.peek();
        }
        
        return -1;
    }

    int size() {
        // Implement size operation
        return s1.size() + s2.size();
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna