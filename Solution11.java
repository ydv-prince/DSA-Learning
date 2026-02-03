//11. Container With Most Water
public class Solution11 {
    public static int maxArea(int[] height) {
        int left = 0, right = height.length-1, maxArea = 0;

        while(left < right){
            int currentHeight = Math.min(height[left], height[right]);
            int currentWidth = right - left;
            int currentArea = currentHeight * currentWidth;

            maxArea = Math.max(currentArea, maxArea);

            if(height[left] > height[right]){
                right--;
            }
            else{
                left++;
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        // int[] height = {1,1};
        int[] height = {1,8,6,2,5,4,8,3,7};

        System.out.println(maxArea(height));
    }
}
