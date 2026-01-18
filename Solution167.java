public class Solution167 {
    public static int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length-1;

        while(left <= right){
            int sum = numbers[left] + numbers[right];

            if(sum == target){
                return new int[] {left+1, right+1};
            }
            else if(sum < target){
                left++;
            }
            else{
                right--;
            }
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        // int[] numbers = {2,7,11,15};
        // int target = 9;

        int[] numbers = {2,3,4};
        int target = 6;

        Solution350.printArr(twoSum(numbers, target));
    }
}
