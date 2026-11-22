class Solution {
    public boolean reachesOne(int n) {
        Set<Integer> isVisited = new HashSet<>();
        while(n != 1 && !isVisited.contains(n)){
            isVisited.add(n);
            n = getNum(n);
        }
        
        return n == 1;
    }
    
    private int getNum(int n){
        int sqSum = 0;
        while(n>0){
            int digit = n%10;
            sqSum += digit*digit;
            n /= 10;
        }
        
        return sqSum;
    }
};

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna