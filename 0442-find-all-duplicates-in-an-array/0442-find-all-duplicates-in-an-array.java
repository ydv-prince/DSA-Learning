class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int n = nums.length;

        for(int i=0; i<n; i++){
            while(nums[i] != nums[nums[i]-1]){
                swap(nums, i, nums[i]-1);
            }
        }

        List<Integer> duplicates = new ArrayList<>();
        for(int j=0; j<n; j++){
            if(nums[j] != j+1){
                duplicates.add(nums[j]);
            }
        }
        return duplicates;
    }

    private void swap(int[] arr, int left, int right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna