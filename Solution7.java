public class Solution7 {
    public static int reverse(int x) {
        int revresedNum = 0;

        while(x != 0){
            if(revresedNum > Integer.MAX_VALUE || revresedNum < Integer.MIN_VALUE){
                return 0;
            }

            int digit = x%10;
            revresedNum = revresedNum * 10 + digit;
            x /= 10;
        }

        return revresedNum;
    }
}
