//875. Koko Eating Bananas
public class Solution875 {
    public static int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        for(int pile : piles){
            max = Math.max(max, pile);
        }

        int left = 1;
        int right = max;
        int firstIdx = -1;

        while(left <= right){
            int mid = left + (right-left) / 2;

            long totalHours = 0;
            for(int pile : piles){
                totalHours += (pile + mid -1) / mid;
            }

            if(totalHours <= h){
                firstIdx = mid;
                right = mid-1;
            }
            else{
                left = mid + 1;
            }
        }
        return firstIdx;
    }

    public static void main(String[] args) {
        // int[] piles = {3,6,7,11}; int h = 8;
        // int[] piles = {30,11,23,4,20}; int h = 5;
        // int[] piles = {30,11,23,4,20}; int h = 6;
        int[] piles = {805306368,805306368,805306368}; int h = 1000000000;

        System.out.println(minEatingSpeed(piles, h));
    }
}
