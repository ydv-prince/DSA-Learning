import java.util.*;
public class Solution1 {
    public static int[] twoSum(int[] nums, int target) {
        int result[] = new int[2];

        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int diff = target - nums[i];
            if(map.containsKey(diff)){
                int index = map.get(diff);
                result[0] = i;
                result[1] = index;
                return result;
            }
            else{
                map.put(nums[i], i);
            }
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        // int nums[] = {2,7,11,15};
        // int target = 9;

        // int nums[] = {3,2,4};
        // int target = 6;

        // int nums[] = {3,3};
        // int target = 6;

        int nums[] = {7,11,15,2};
        int target = 9;

        Solution350.printArr(twoSum(nums, target));
    }
}
