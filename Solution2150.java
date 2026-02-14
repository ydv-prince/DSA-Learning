//2150. Find All Lonely Numbers in the Array
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution2150 {
    public static List<Integer> findLonely(int[] nums) {
        Map<Integer, Integer> count = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for(int num : nums){
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        for(int num : nums){
            if(count.get(num) == 1 && !count.containsKey(num-1) && !count.containsKey(num+1)){
                result.add(num);
            }
        }
        return result;
    }

    //Main method
    public static void main(String[] args) {
        // int[] nums = {10, 6, 5, 8};
        int[] nums = {1, 3, 5, 3};

        System.out.println(findLonely(nums));
    }
}
