//150. Evaluate Reverse Polish Notation
import java.util.Deque;
import java.util.ArrayDeque;

public class Solution150 {
    public static int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();

        for(String token : tokens){
            if(token.length() > 1 || Character.isDigit(token.charAt(0))){
                stack.push(Integer.parseInt(token));
            }
            else{
                int secondOperand = stack.pop();
                int firstOperand = stack.pop();

                switch(token){
                    case "+":
                        stack.push(firstOperand + secondOperand);
                        break;
                    case "-":
                        stack.push(firstOperand - secondOperand);
                        break;
                    case "*":
                        stack.push(firstOperand * secondOperand);
                        break;
                    case "/":
                        stack.push(firstOperand / secondOperand);
                        break;
                }
            }
        }
        return stack.pop();
    }

    //Main method
    public static void main(String[] args) {
        // String[] values = {"2","1","+","3","*"};
        // String[] values = {"4","13","5","/","+"};
        String[] values = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};

        System.out.println(evalRPN(values));

    }
}