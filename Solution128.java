//128. Longest Consecutive Sequence
import java.util.HashSet;
import java.util.Set;
class Solution128 {
    public static int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        int longest = 0;
        Set<Integer> numSet = new HashSet<>();
        for(int num : nums){
            numSet.add(num);
        }
        for(int num : numSet){
            if(!numSet.contains(num-1)){
                int currNum = num;
                int currStreak = 1;
                while(numSet.contains(currNum+1)){
                    currStreak++;
                    currNum++;
                }
                longest = Math.max(currStreak, longest);
            }
        }
        return longest;
    }

    //Main method
    public static void main(String[] args) {
        int[] nums = {100,4,200,1,3,2};
        // int[] nums = {0,3,7,2,5,8,4,6,0,1};
        // int[] nums = {1,0,1,2};

        System.out.println(longestConsecutive(nums));
    }
}