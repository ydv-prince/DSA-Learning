//118. Pascal's Triangle
import java.util.ArrayList;
import java.util.List;
public class Solution118{
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascalTriangle = new ArrayList<>();

        pascalTriangle.add(List.of(1));
        for(int rowIdx=0; rowIdx<numRows-1; rowIdx++){
            List<Integer> currRow = new ArrayList<>();
            currRow.add(1);

            List<Integer> prevRow = pascalTriangle.get(rowIdx);
            for(int colIdx=1; colIdx<prevRow.size(); colIdx++){
                int sum = prevRow.get(colIdx-1) + prevRow.get(colIdx);
                currRow.add(sum);
            }
            currRow.add(1);
            pascalTriangle.add(currRow);
        }
        return pascalTriangle;
    }

    public static void main(String[] args) {
        int numRows = 5;
        // int numRows = 1;

        System.out.println(generate(numRows));
    }
}
