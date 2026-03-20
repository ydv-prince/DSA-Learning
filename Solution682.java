//682. Baseball Game
import java.util.ArrayDeque;
import java.util.Deque;

public class Solution682 {
    public static int calPoints(String[] operations) {
        Deque<Integer> stack = new ArrayDeque<>();

        for(String operation : operations){
            if("+".equals(operation)){
                int lastScore = stack.pop();
                int secondLast = stack.peek();
                stack.push(lastScore);
                stack.push(lastScore + secondLast);
            }
            else if("D".equals(operation)){
                int lastScore = stack.peek();
                stack.push(2*lastScore);
            }
            else if("C".equals(operation)){
                stack.pop();
            }
            else{
                stack.push(Integer.parseInt(operation));
            }
        }

        int total = 0;
        for(int n : stack){
            total += n;
        }

        return total;
    }

    //Main method
    public static void main(String[] args) {
        // String[] operations = {"5","2","C","D","+"};
        // String[] operations = {"5","-2","4","C","D","9","+","+"};
        String[] operations = {"1","C"};

        System.out.println(calPoints(operations));
    }
}
