//153. Find Minimum in Rotated Sorted Array
public class Solution153 {
    public static int findMin(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = n-1;
        int firstTrue = -1;

        while(left <= right){
            int mid = left + (right - left)/2;

            if(nums[mid] <= nums[n-1]){
                firstTrue = mid;
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        return nums[firstTrue];
    }
}