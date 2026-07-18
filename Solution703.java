//703. Kth Largest Element in a Stream

import java.util.PriorityQueue;
public class Solution703{
    private PriorityQueue<Integer> minHeap;
    private int k;

    public Solution703(int k, int[] nums) {
        this.k = k;
        this.minHeap = new PriorityQueue<>(k);

        for(int num : nums){
            add(num);
        }
    }
    
    public int add(int val) {
        if(minHeap.peek() < val){
            minHeap.offer(val);
        }

        if(minHeap.size() > k){
            minHeap.poll();
        }
        return minHeap.peek();
    }
}