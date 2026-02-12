//31. Next Permutation
class Solution31{
    public static void nextPermutation(int[] nums) {
        int length = nums.length;
        int pivotIdx = length - 2;

        while(pivotIdx >= 0){
            if(nums[pivotIdx] < nums[pivotIdx+1]){
                break;
            }
            pivotIdx--;
        }

        if(pivotIdx >= 0){
            int swapIdx = length - 1;
            while(swapIdx > pivotIdx){
                if(nums[swapIdx] > nums[pivotIdx]){
                    swap(nums, pivotIdx, swapIdx);
                    break;
                }
                swapIdx--;
            }
        }

        int left = pivotIdx + 1;
        int right = length -1;
        while(left < right){
            swap(nums, left, right);
            left++;
            right--;
        }
    }

    private static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    //Main method
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        // int[] nums = {3,2,1};
        // int[] nums = {1,1,5};

        Solution350.printArr(nums);
        nextPermutation(nums);
        Solution350.printArr(nums);
    }
}