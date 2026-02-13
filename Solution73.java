//73. Set Matrix Zeroes
public class Solution73 {
    public static void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        boolean[] zeroRows = new boolean[rows];
        boolean[] zeroCols = new boolean[cols];

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(matrix[i][j] == 0){
                    zeroRows[i] = 0;
                    zeroCols[j] = 0;
                }
            }
        }

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(zeroCols[j] || zeroRows[i]){
                    matrix[i][j] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1,1,1},
            {1,0,1},
            {1,1,1}
        };

        // int[][] matrix = {
        //     {0,1,2,0},
        //     {3,4,5,2},
        //     {1,3,1,5}
        // };
        
        Solution350.printMatrix(matrix);
        setZeroes(matrix);
        Solution350.printMatrix(matrix);
    }
}