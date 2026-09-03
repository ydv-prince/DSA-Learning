class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        
        if(n == 1){ return nums[0]; }
        
        if(nums[0] != nums[1]){ return nums[0]; }
        
        if(nums[n-1] != nums[n-2]){ return nums[n-1]; }
        
        int left = 1;
        int right = n-2;
        
        while(left <= right){
            int mid = left + (right-left) / 2;
            
            //If both neighbours are diff return arr[mid]
            if(nums[mid] != nums[mid-1] && nums[mid] != nums[mid+1]){
                return nums[mid];
            }
            
            // (even, odd) --> move to right half
            if(mid % 2 == 1 && nums[mid] == nums[mid-1] ||
                mid % 2 == 0 && nums[mid] == nums[mid+1]){
                    left = mid+1;
            }
              
            // (odd, even) --> move to left half  
            else{
                right = mid-1;
            }
        }
        return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna