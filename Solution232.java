//232. Implement Queue using Stacks
import java.util.ArrayDeque;
import java.util.Deque;

public class Solution232 {
    private Deque<Integer> inputStack = new ArrayDeque<>();
    private Deque<Integer> outputStack = new ArrayDeque<>();

    public Solution232() {}
    
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
