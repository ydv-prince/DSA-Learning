//896. Monotonic Array
public class Solution896 {
    public static boolean isMonotonic(int[] nums) {
        boolean isAscending = false;
        boolean isDescending = false;

        for(int i=1; i<nums.length; i++){
            if(nums[i-1] > nums[i]){
                isDescending = true;
            }

            if(nums[i-1] < nums[i]){
                isAscending = true;
            }

            if(isAscending && isDescending){
                return false;
            }
        }
        return true;
    }

    //Main method
    public static void main(String[] args) {
        // int[] nums = {1,2,2,3};
        // int[] nums = {6,5,4,4};
        int[] nums = {1,3,2};

        System.out.println(isMonotonic(nums));
    }
}
