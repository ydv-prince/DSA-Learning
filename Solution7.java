//7. Reverse Integer
public class Solution7 {
    public static int reverse(int x) {
        int revresedNum = 0;

        while(x != 0){
            if(revresedNum > Integer.MAX_VALUE / 10 || revresedNum < Integer.MIN_VALUE / 10){
                return 0;
            }

            int digit = x%10;
            revresedNum = revresedNum * 10 + digit;
            x /= 10;
        }

        return revresedNum;
    }

    public static void main(String[] args) {
        // int x = 123;
        // int x = -123;
        // int x = 120;
        int x = 2014748364;

        System.out.println(reverse(x));
    }
}
