class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
         int n = bloomDay.length;
         long requiredF = (long) m * k;

        if(requiredF > n){
            return -1;
        }
        
        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;
        
        for(int num : bloomDay){
            maxi = Math.max(maxi, num);
            mini = Math.min(mini, num);
        }
        
        int low = mini, high = maxi;
        
        while(low <= high){
            int mid = low + (high - low) / 2;
            
            if(possible(bloomDay, mid, k, m)){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        
        return low;
    }

    private boolean possible(int[] arr, int day, int k, int m){
        
        int count = 0;
        int bouquets = 0;
        
        for(int num : arr){
            if(num <= day){
                count++;
            }
            else{
                bouquets += count / k;
                count=0;
            }
        }
        
        bouquets += count / k;
        count=0;
        
        return bouquets >= m;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna