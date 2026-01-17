//202. Happy Number
import  java.util.*;
public class Solution202 {
    public static boolean isHappy(int n) {
        Set<Integer> visitedSet = new HashSet<>();

        while(n != 1 && !visitedSet.contains(n)){
            visitedSet.add(n);

            int squareSum = 0;
            while(n != 0){
                int digit = n%10;
                squareSum += digit*digit;
                n /= 10;
            }
            n = squareSum;
        }
        return n==1;
    }

    public static void main(String[] args) {
        // int n = 19;
        int n = 2;
        System.out.println(isHappy(n));
    }
}
