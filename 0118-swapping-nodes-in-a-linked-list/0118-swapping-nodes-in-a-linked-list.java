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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode slow = head;
        ListNode fast = head;

        for(int i=1; i<k; i++){
            fast = fast.next;
        }

        ListNode first = fast;

        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }

        ListNode last = slow;

        int temp = first.val;
        first.val = last.val;
        last.val = temp;

        return head;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna