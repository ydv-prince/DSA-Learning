//136. Single Number
import java.util.HashSet;
import java.util.Set;
public class Solution136{
    public static int singleNumber(int[] nums) {
        Set<Integer> numSet = new HashSet<>();

        for(int n : nums){
            if(numSet.contains(n)){
                numSet.remove(n);
            }
            else{
                numSet.add(n);
            }
        }
        
        return numSet.iterator().next();
    }

    public static void main(String[] args) {
        // int[] nums = {2,2,1};
        // int[] nums = {4,1,2,1,2};
        int[] nums = {1};

        System.out.println(singleNumber(nums));
    }
}