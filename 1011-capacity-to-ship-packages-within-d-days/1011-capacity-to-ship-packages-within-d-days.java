class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int maxi = Integer.MIN_VALUE;
        int sum = 0;

        for(int weight : weights){
            sum += weight;
            maxi = Math.max(maxi, weight);
        }

        while(maxi <= sum){
            int mid = maxi + (sum - maxi) / 2;
            int nDays = calcDays(weights, mid);

            if(nDays <= days){
                sum = mid-1;
            }
            else{
                maxi = mid+1;
            }
        }
        return maxi;
    }

    private int calcDays(int[] weights, int capacity){
        int load = 0;
        int days = 1;

        for(int weight : weights){
            if(load + weight > capacity){
                days++;
                load = weight;
            }
            else{
                load += weight;
            }
        }
        return days;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna