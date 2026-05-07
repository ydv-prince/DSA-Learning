//179. Largest Number
import java.util.ArrayList;
import java.util.List;
public class Solution179{
    public static String largestNumber(int[] nums) {
        List<String> result = new ArrayList<>();

        for(int num : nums){
            result.add(String.valueOf(num));
        }

        result.sort((a,b) -> (b+a).compareTo(a+b));

        if(result.get(0).equals("0")){ return "0"; }

        return String.join("", result);
    }

    public static void main(String[] args) {
        // int[] nums = {10, 2};
        int[] nums = {3,30,34,5,9};

        System.out.println(largestNumber(nums));
    }
}
