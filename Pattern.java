public class Pattern{

    public static void hollow_rectangle(int totRows, int totCols){
        // Outer - loop : for rows
        for(int rows = 1; rows <= totRows; rows++){
            // inner - loop : for columns
            for(int cols = 1; cols <= totCols; cols++){
                if(rows == 1 || rows == totRows || cols == 1 || cols == totCols){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
        System.out.println();
        }
    }

    public static void inverted_rotated_half_pyramid(int n){
        //Outer
        for(int row = 1; row <= n; row++){
            //Spaces
            for(int space = 1; space <= n - row; space++){
                System.out.print(" ");
            }
            //Star
            for(int star = 1; star <= row; star++){
                System.out.print("*");
            }
        System.out.println();
        }
    }

    public static void inverted_half_pyramid_numbers(int n){
        //Outer - row
        for(int row = 1; row <= n; row++){
            //Inner - col
            for(int num = 1; num <= n-row+1; num++){
                System.out.print(num);
            }
        System.out.println();
        }
    }

    public static void floyd_triangle(int n){
        int number = 1;
        //Outer rows
        for(int row = 1; row <= n; row++){
            // Inner cols
            for(int num = 1; num <= row; num++){
                System.out.print(number + " ");
                number++;
            }
            
            System.out.println();
        }

    }

    public static void zero_one_triangle(int n){
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= row; col++){
                if((row + col) % 2 == 0){
                    System.out.print(1 + " ");
                }
                else{
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }
    }

    public static void buterfly_pattern(int n){
        //First half
        //Outer loop
        for(int rows = 0; rows <= n; rows++){

            //Star
            for(int star = 1; star <= rows; star++){
                System.out.print("*");
            }

            //Space
            for(int space = 1; space <= 2*(n- rows); space++){
                System.out.print(" ");
            }

            //Star
            for(int star = 1; star <= rows; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    
        //Second - Half
        for(int rows = n; rows >= 1; rows--){

            //Star
            for(int star = 1; star <= rows; star++){
                System.out.print("*");
            }

            //Space
            for(int space = 1; space <= 2*(n- rows); space++){
                System.out.print(" ");
            }

            //Star
            for(int star = 1; star <= rows; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void solid_rhombus(int n) {
        //Space
        for(int rows = 1; rows <= n; rows++){
            for(int space = 0; space <= n - rows; space++){
            System.out.print(" ");
            }
            for(int star = 1; star <= n; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void hollow_rhombus(int n){
        //Rows
        for(int row = 1; row <= n; row++){
            //Spaces
            for(int space = 1; space <= n - row; space++){
                System.out.print(" ");
            }
            //Hollow - rectangle(Star)
            for(int star = 1; star <= n; star++){
                if(star == 1 || star == n || row == 1 || row == n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            // for(int star = 1; star <= n - row; star++){
            //     if(row == 1 || row == n || star == 1 || star == n){
            //         System.out.print("*");
            //     }
            //     else{
            //         System.out.print(" ");
            //     }
            // }
            System.out.println();
        }
    }

    public static void diamond_pattern(int n){
        //Row
        for(int row = 1; row <= n; row++){
            //Spaces
            for(int space = 1; space <= n - row; space++){
                //Print star
                System.out.print(" ");
                }
                for(int star = 1; star <= (2 * row) - 1; star++){
                    System.out.print("*");
                }
                System.out.println();
            }

        //Second - Half
        //for(int row = n; row >= 1; row--){    --for two row at middle row
        for(int row = n - 1; row >= 1; row--){
            //Spaces
            for(int space = 1; space <= n - row; space++){
                //Print star
                System.out.print(" ");
            }
            for(int star = 1; star <= (2 * row) - 1; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        //hollow_rectangle(5,10);
        //inverted_rotated_half_pyramid(5);
        //inverted_half_pyramid_numbers(6);
        //floyd_triangle(4);
        //zero_one_triangle(5);
        //buterfly_pattern(10);
        //solid_rhombus(9);
        //hollow_rhombus(5);
        diamond_pattern(5);
    }
}
