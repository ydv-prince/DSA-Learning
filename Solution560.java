//560. Subarray Sum Equals K

import java.util.HashMap;
import java.util.Map;

public class Solution560 {
    public static int subarraySum(int[] nums, int k) {
    // Map to store frequency of each prefix sum encountered so far.
    // Key   -> prefix sum
    // Value -> number of times this prefix sum has appeared
    Map<Integer, Integer> preCount = new HashMap<>();
    
    // Initialize with prefix sum 0 occurring once.
    // This handles cases where a subarray starting from index 0 sums to k.
    preCount.put(0, 1);

    int currSum = 0;   // Running prefix sum
    int count = 0;     // Number of valid subarrays found

    // Traverse through the array
    for (int num : nums) {
        // Update running prefix sum
        currSum += num;

        // If (currSum - k) has appeared before,
        // then there exists a previous prefix such that:
        // currSum - previousPrefix = k
        // Meaning the subarray between them sums to k.
        if (preCount.containsKey(currSum - k)) {
            count += preCount.get(currSum - k);
        }

        // Record/update the current prefix sum frequency
        // This allows future elements to form valid subarrays with this prefix
        preCount.put(currSum, preCount.getOrDefault(currSum, 0) + 1);
    }

    // Return total number of subarrays whose sum equals k
    return count;
}

    //Main method
    public static void main(String[] args) {
        // int[] nums = {1,1,1};
        // int k = 2;

        int[] nums = {1,2,3};
        int k = 3;

        System.out.println(subarraySum(nums, k));
    }
}
