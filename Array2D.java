public class Array2D {

    //Spiral Matrix
    public static void printSpiral(int matrix[][]){
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;

        while (startRow <= endRow && endCol >= startRow) { 
            //top
            for(int j = startCol; j <= endCol; j++){
                System.out.print(matrix[startRow][j]+ " ");
            }

            //right
            for(int i = startRow+1; i <= endRow; i++){
                System.out.print(matrix[i][endCol]+ " ");
            }

            //bottom
            for(int j = endCol-1; j >= startCol; j--){
                if(startRow == endRow){
                    break;
                }
                System.out.print(matrix[endRow][j]+ " ");
            }

            //left
            for(int i = endRow-1; i >= startRow+1; i--){
                if(startCol == endCol){
                    break;
                }
                System.out.print(matrix[i][startCol]+ " ");
            }

            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
        System.out.println();
    }

    //Diagonal Sum
    public static int diagonalSum(int matrix[][]){
        int sum = 0;

        // for(int i = 0; i < matrix.length; i++){
        //     for(int j = 0; j < matrix[0].length; j++){
        //         if(i == j){
        //             sum += matrix[i][j];
        //         }
        //         else if(i+j == matrix.length-1){
        //             sum += matrix[i][j];
        //         }
        //     }
        // }

        for(int i = 0; i < matrix.length; i++){
            //pd
            sum += matrix[i][i];
            //sd
            if(i != matrix.length-i-1){
                sum += matrix[i][matrix.length-i-1];
            }
        }

        return sum;
    }

    //Search in sorted matrix -- Staircase
    public static boolean stairCase(int matrix[][], int key){
        int row = 0, col = matrix[0].length-1;

        while(row < matrix.length && col >= 0){
            if(key == matrix[row][col]){
                System.out.println("Key found at ("+ row+","+col+")");
                return true;
            }
            else if(key < matrix[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("Key not found");
        return false;
    }

    //Search in sorted matrix -- Staircase
    public static boolean stairCase1(int matrix[][], int key){
        int row = matrix.length-1, col = 0;
        while(row >= 0 && col < matrix[0].length){
            if(key == matrix[row][col]){
                System.out.println("Key found at ("+ row+","+col+")");
                return true;
            }
            else if(key > matrix[row][col]){
                col++;
            }
            else{
                row--;
            }
        }
        System.out.println("Key not found");
        return false;
    }

    //main method
    public static void main(String[] args) {
        // int matrix[][] = {{1,2,3,4,5},
        //                   {6,7,8,9,10},
        //                   {11,12,13,14,15}
        //                   };

        // //printSpiral(matrix);

        int matrix[][] = {
                            {1,2,3},
                            {4,5,6},
                            {7,8,9}
        };
        System.out.println(diagonalSum(matrix));

        // int matrix[][] = {{10,20,30,40},
        //                   {15,25,35,45},
        //                   {27,29,37,48},
        //                   {32,33,39,50}};

        int key = 5;
        stairCase1(matrix, key);
    }
}
