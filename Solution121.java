public class Solution121 {
    public static int maxProfit(int[] prices) {
        int ans=0;
        int minPrice = Integer.MAX_VALUE;
        for(int i=0; i<prices.length; i++){
            int currPrice = prices[i];
            minPrice = Math.min(minPrice, currPrice);
            ans = Math.max(ans, currPrice-minPrice);
        }
        return ans;
    }

    //Main method
    public static void main(String[] args) {
        // int[] prices = {7,1,5,3,6,4};
        // int[] prices = {7,6,4,3,1};
        int[] prices = {7,6,4,2,3,1};

        System.out.println(maxProfit(prices));
    }
}
