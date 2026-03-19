public import java.util.Stack;

public class StackHelper {

    // Build stack from array
    public static Stack<Integer> buildStack(int[] values) {
        Stack<Integer> stack = new Stack<>();

        for (int val : values) {
            stack.push(val);
        }

        return stack;
    }

    // Print stack without modifying original stack
    public static void printStack(Stack<Integer> stack) {

        Stack<Integer> temp = new Stack<>();
        temp.addAll(stack);

        System.out.print("Stack (top → bottom): ");

        while (!temp.isEmpty()) {
            System.out.print(temp.pop() + " ");
        }

        System.out.println();
    }

    // Print stack bottom to top
    public static void printStackBottom(Stack<Integer> stack) {

        System.out.print("Stack (bottom → top): ");

        for (Integer val : stack) {
            System.out.print(val + " ");
        }

        System.out.println();
    }
} {
    
}
