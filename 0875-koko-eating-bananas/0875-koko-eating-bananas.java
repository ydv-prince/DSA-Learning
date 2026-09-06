class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = findMax(piles);

        while(low <= high){
            int mid = low + (high - low) /2;

            long totalH = calcHours(piles, mid);

            if(totalH <= h){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }   
        return low;
    }

    private long calcHours(int[] arr, int rate){
        long totalHrs = 0;

        for(int num : arr){
            totalHrs += (int) Math.ceil((double) num / rate);
        }

        return totalHrs;
    }

    private int findMax(int[] arr){
        int max = Integer.MIN_VALUE;

        for(int num : arr){
            max = Math.max(max, num);
        }

        return max;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna