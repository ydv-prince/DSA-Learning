class Solution {
    public int minTime(int[] arr, int k) {
        return findPages(arr, k);
    }
    
    public int findPages(int[] arr, int k) {
            int low = Integer.MIN_VALUE;
            int high = 0;

            for(int num : arr){
                low = Math.max(low, num);
                high += num;
            }

            while(low <= high){
                int mid = low + (high - low) / 2;
                int noStudents = calcStudents(arr, mid);

                if(noStudents  > k){
                    low = mid+1;
                }
                else{
                    high = mid-1;
                }
            }

            return low;
        }

        private int calcStudents(int[] arr, int pages){
            int student = 1;
            int pagesStudent = 0;

            for(int num : arr){
                if(pagesStudent + num <= pages){
                    pagesStudent += num;
                }
                else{
                    student++;
                    pagesStudent = num;
                }
            }
            return student;
        }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna