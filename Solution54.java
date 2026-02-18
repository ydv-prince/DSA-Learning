//54. Spiral Matrix
import java.util.List;
import java.util.ArrayList;
class Solution54 {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        int left=0, right=matrix[0].length-1;
        int top=0, bottom=matrix.length-1;

        while(left <= right && top <= bottom){

            //left to right
            for(int col=left; col<=right; col++){
                result.add(matrix[top][col]);
            }
            top++;

            //top to bottom
            for(int row=top; row<=bottom; row++){
                result.add(matrix[row][right]);
            }
            right--;

            //right to left
            if(top <= bottom){
                for(int col=right; col >= left; col--){
                    result.add(matrix[bottom][col]);
                }
                bottom--;
            }

            //bottom to top
            if(left <= right){
                for(int row=bottom; row>= top; row--){
                    result.add(matrix[row][left]);
                }
                left++;
            }
        }
        return result;
    }

    //main method
    public static void main(String[] args) {
        // int[][] matrix = {
        //     {1,2,3},
        //     {4,5,6},
        //     {7,8,9}
        // };

        int[][] matrix = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12}
        };

        System.out.println(spiralOrder(matrix));
    }
}