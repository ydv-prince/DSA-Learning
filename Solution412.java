import  java.util.*;
public class Solution412 {
    public static List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();

        for(int i=1; i<=n; i++){
            String currentString = "";
            if(i % 3 == 0){
                currentString += "Fizz";
            }
            if(i % 5 == 0){
                currentString += "Buzz";
            }
            if(currentString.length() == 0){
                currentString += i;
            }
            result.add(currentString);
        }
        return result;
    }

    public static void main(String[] args) {
        // int n = 3;
        // int n = 5;
        int n = 15;
        Solution350.printArrList(fizzBuzz(n));
    }
}
