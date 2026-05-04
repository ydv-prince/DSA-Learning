//162. Find Peak Element
public class Solution162 {
    public static int findPeakElement(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = n-1;
        int firstTrueIdx = -1;

        while(left <= right){
            int mid = left + (right - left)/2;
            if(mid == n-1 || nums[mid] > nums[mid+1]){
                firstTrueIdx = mid;
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }
        return firstTrueIdx;
    }

    public static void main(String[] args) {
        // int[] nums = {1,2,3,1};
        int[] nums = {1,2,1,3,5,6,4};

        System.out.println(findPeakElement(nums));
    }
}
