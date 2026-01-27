//217. Contains Duplicate
import java.util.HashSet;
public class Solution217 {
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> count = new HashSet<>();

        for(int num : nums){
            if(count.contains(num)){
                return true;
            }
            count.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        // int nums[] = {1,2,3,1};
        // int nums[] = {1,2,3,4};
        int nums[] = {1,1,1,3,3,4,3,2,4,2};

        System.out.println(containsDuplicate(nums));
    }
}
