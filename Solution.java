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


import java.util.Arrays;
class Solution {
    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);

        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i-1]){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,1};
        System.out.println(containsDuplicate(arr));
    }
}