//239. Sliding Window Maximum
import java.util.PriorityQueue;
public class Solution239{
    public static int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] result = new int[n-k+1];
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a,b) -> {
            if(a[0] == b[0]){
                return a[1] - b[1]; //ascending for equal -> On Index
            }
            return b[0] - a[0]; //Descending order
        });

        for(int i=0; i<k-1; i++){
            maxHeap.offer(new int[] {nums[i], i});
        }

        int idx = 0;
        for(int i=k-1; i<n; i++){
            maxHeap.offer(new int[] {nums[i], i});

            while(maxHeap.peek()[1] <= i-k){
                maxHeap.poll();
            }

            result[idx++] = maxHeap.peek()[0];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,-1,-3,5,3,6,7}; int k = 3;
        // int[] nums = {1}; int k = 1;

        int[] output = maxSlidingWindow(nums, k);
        Solution350.printArr(output);
    }
}