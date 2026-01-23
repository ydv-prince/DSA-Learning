//9. Palindrome Number
public class Solution9 {
    public static boolean isPalindrome(int x) {
        if(x<0 || (x>0 && x%10 == 0)) return false;

        int reversedHalf = 0;

        while(reversedHalf < x){
            reversedHalf = reversedHalf*10+x%10;
            x/=10;
        }

        return reversedHalf == x || x == reversedHalf / 10;
    }
    public static void main(String[] args) {
        // int x = 121;
        // int x = -121;
        int x = 10;
        System.out.println(isPalindrome(x));
    }
}
