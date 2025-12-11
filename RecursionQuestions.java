public class RecursionQuestions {
    static String digits[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    //Q1. For a given integer array of size N. You have to find all the occurences (indices) of a given element (key) and print them. Use a recursive function to solve this problem.
    public static void printIndex(int arr[], int key, int idx){
        //Base Case
        if(idx == arr.length){
            return;
        }

        //Work
        if(arr[idx] == key){
            System.out.println(idx);
        }

        //Recursive call
        printIndex(arr, key, idx+1);
    }

    /*Q2. You are given a number (2019), convert it into a String of English like "two zero one nine". Use a recursive function to solve this problem.
    NOTE - The digits of the number will only be in the range 0 - 9 and the last digit of a number can't be 0.
    */
    public static void printDigits(int num){
        //Base case
        if(num == 0){
            return;
        }
        //Work
        int lastDigit = num % 10;
        System.out.print(digits[lastDigit]+ " ");

        //Recursive call
        printDigits(num/10);
    }

    //Q3. Write a program to find Length of a Sring using Recursion.
    public static int findLength(String str) {
        //System.out.println(str.substring(1));
        //base case
        if(str.length() == 0){
            return 0;
        }

        //work + recursive call
        return findLength(str.substring(1))+ 1;
    }

    //Q4. We are given a string S, we need to find the count of all contiguous substrings starting and ending with the same character.
    //https://youtu.be/u-HgzgYe8KA?si=Gv5a_7_s6OOzDgIz


    public static void main(String[] args) {
        // int arr[] = {3,2,4,5,6,2,7,2,2};
        // int key = 2;
        // printIndex(arr, key, key);

        // int num = 2409;
        // printDigits(num);

        String str = "Apple";
        System.out.println(findLength(str));
    }
}
