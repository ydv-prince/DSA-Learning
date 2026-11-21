class Solution {
    public int nthUglyNumber(int n) {
        Set<Long> visitedNums = new HashSet<>();
        PriorityQueue<Long> minHeap = new PriorityQueue<>();
        int[] primeFactors = new int[] {2, 3, 5};

        minHeap.offer(1L);
        visitedNums.add(1L);

        long currUglyNum = 0;
        
        while(n-- > 0){
            currUglyNum = minHeap.poll();

            for(int factor : primeFactors){
                long nextUglyNum = currUglyNum * factor;
                if(visitedNums.add(nextUglyNum)){
                    minHeap.offer(nextUglyNum);
                }
            }
        }

        return (int) currUglyNum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna