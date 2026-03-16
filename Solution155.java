//155. Min Stack
import java.util.ArrayDeque;
import java.util.Deque;
public class Solution155 {
    private Deque<Integer> mainStack;
    private Deque<Integer> minStack;
    public Solution155() {
        mainStack = new ArrayDeque<>();
        minStack = new ArrayDeque<>();
        minStack.push(Integer.MAX_VALUE);
    }
    
    public void push(int val) {
        mainStack.push(val);
        minStack.push(Math.min(minStack.peek(), val));
    }
    
    public void pop() {
        minStack.pop();
        mainStack.pop();
    }
    
    public int top() {
        return mainStack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }

    //Main method
    public static void main(String[] args) {
        Solution155 stack = new Solution155();

        stack.push(5);
        stack.push(3);
        stack.push(7);

        System.out.println("Top: " + stack.top());
        System.out.println("Min: " + stack.getMin());

        stack.pop();

        System.out.println("Min after pop: " + stack.getMin());
    }
}
