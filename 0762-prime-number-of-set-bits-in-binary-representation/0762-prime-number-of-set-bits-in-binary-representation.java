class Solution {
    //the maximum number of set bits any number can have is 32
    //we only need to determine which numbers from 0 to 32 are prime
    private static final Set<Integer> PRIME_NUMBERS = Set.of(2,3,5,7,11,13,17,19, 23, 29, 31);
    public int countPrimeSetBits(int left, int right) {
        int primeBitCount = 0;
        for(int curr=left; curr <= right; curr++){
            int setBitCount = Integer.bitCount(curr); //O(1)
            if(PRIME_NUMBERS.contains(setBitCount)){   //O(1)
                primeBitCount++;
            }
        }
        return primeBitCount;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna