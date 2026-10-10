/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int numComponents(ListNode head, int[] nums) {
        int count = 0;

        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }

        while(head != null){
            //If nodes not in the set
            while(head != null && !set.contains(head.val)){
                head = head.next;
            }

            //New node in set
            if(head != null){
                count++;
            }

            //consecutive nodes in set
            while(head != null && set.contains(head.val)){
                head = head.next;
            }
        }

        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna