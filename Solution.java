// public class Solution {
//     public static int countNegatives(int[][] grid) {
//     int rows = grid.length;
//     int cols = grid[0].length;

//     int row = 0;
//     int col = cols - 1;
//     int count = 0;

//     while(row < rows && col >= 0){
//         if(grid[row][col] < 0){
//             count += (rows - row);
//             col--;
//         }else{
//             row++;
//         }
//     }
//     return count;
//     }

//     public static void main(String[] args) {
//         int grid1[][] = {
//             {4,3,2,-1},
//             {3,2,1,-1},
//             {1,1,-1,-2},
//             {-1,-1,-2,-3}
//         };

//         int grid2[][] = {
//             {3,2},
//             {1,0}
//         };
//         System.out.println(countNegatives(grid1));
//     }
// }


// import java.util.Arrays;
// class Solution {
//     public static boolean containsDuplicate(int[] nums) {
//         Arrays.sort(nums);

//         for(int i = 1; i < nums.length; i++){
//             if(nums[i] == nums[i-1]){
//                 return true;
//             }
//         }
//         return false;
//     }

//     public static void main(String[] args) {
//         int arr[] = {1,2,3,1};
//         System.out.println(containsDuplicate(arr));
//     }
// }


// //Problem: 283
// class Solution {
//     public static void moveZeroes(int[] nums) {
//         int nonZero = 0;
//         for(int i = 0; i < nums.length; i++){
//             if(nums[i] != 0){
//                 int temp = nums[i];
//                 nums[i] = nums[nonZero];
//                 nums[nonZero] = temp;
//                 nonZero++;
//             }
//         }
//         for(int i = 0; i < nums.length; i++){
//             System.out.print(nums[i]+ " ");
//         }
//     }

//     public static void main(String[] args) {
//         int arr[] = {0};
//         moveZeroes(arr);
//     }
// }

// //26. Remove Duplicates from Sorted Array
// class Solution {
//     public static int removeDuplicates(int[] nums) {
//         if(nums.length == 0){
//             return 0;
//         }
//         int write = 1;
//         for(int read = 1; read < nums.length; read++){
//             if(nums[read] != nums[read-1]){
//                 nums[write] = nums[read];
//                 write++;
//             }
//         }
//         return write;
//     }
//     public static void main(String[] args) {
//         int arr[] = {0,0,1,1,1,2,2,3,3,4,5,5,7,7,8,9,9};
//         System.out.println(removeDuplicates(arr));
//     }
// }

//268. Missing Number
import java.util.Arrays;
class Solution {
    public static int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){
            if(nums[i] != i){
                return i;
            }
        }
        return nums.length;
    }
    public static void main(String[] args) {
        int arr[] = {7,6,4,2,3,5,1,-1};
        System.out.println(missingNumber(arr));
    }
}