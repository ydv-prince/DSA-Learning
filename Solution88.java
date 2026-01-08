//88. Merge Sorted Array
public class Solution88 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int last = m+n-1;

        while(m>0 && n>0){
            if(nums1[m-1] > nums2[n-1]){
                nums1[last] = nums1[m-1];
                m--;
            }
            else{
                nums1[last] = nums2[n-1];
                n--;
            }
            last--;
        }

        while(n>0){
            nums1[last] = nums2[n-1];
            last--;
            n--;
        }
    }
    public static void main(String[] args) {
        // int[] nums1 = {1,2,3,0,0,0};
        // int[] nums2 = {2,5,6};
        // int m = 3;
        // int n = 3;
        // merge(nums1, m, nums2, n);
        // Solution350.printArr(nums1);

        // int[] nums1 = {1};
        // int[] nums2 = {};
        // int m = 1;
        // int n = 0;
        // merge(nums1, m, nums2, n);
        // Solution350.printArr(nums1);

        int[] nums1 = {0};
        int[] nums2 = {1};
        int m = 0;
        int n = 1;
        merge(nums1, m, nums2, n);
        Solution350.printArr(nums1);
    }
}
