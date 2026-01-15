//75. Sort Colors
class Solution75 {
    public static void sortColors(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        int current = 0;
        while(current <= right){
            if(nums[current] == 0){
                swap(nums, left, current);
                left++;
                current++;
            }
            else if(nums[current] == 1){
                current++;
            }
            else{
                swap(nums, right, current);
                right--;
            }
        }
    }
    private static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int nums[] = {2,0,2,1,1,0};
        // int nums[] = {2,0,1};
        sortColors(nums);
        Solution350.printArr(nums);
    }
}