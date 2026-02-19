//560. Subarray Sum Equals K

public class Solution560 {
    public static int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int count = 0;

        for(int i=0; i<n; i++){
            int sum = 0;
            for(int j=i; j<n; j++){
                sum += nums[j];
                if(sum == k){
                count++;
                }
            }
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
