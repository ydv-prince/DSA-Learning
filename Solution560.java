//560. Subarray Sum Equals K
import java.util.HashMap;
import java.util.Map;

public class Solution560 {
    public static int subarraySum(int[] nums, int k) {
    Map<Integer, Integer> prefixcount = new HashMap<>();
    prefixcount.put(0,1);

    int count = 0;
    int currSum = 0;

    for(int num : nums){
        currSum += num;
        count += prefixcount.getOrDefault(currSum - k, 0);
        prefixcount.merge(currSum, 1, Integer::sum);
    }
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
