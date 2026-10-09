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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head.next == null || left == right) return head;

        ListNode dummy = new ListNode(0, head);
        ListNode beforeReverse = dummy;
        for(int i=0; i<left-1; i++){
            beforeReverse = beforeReverse.next;
        }

        ListNode connBeforeReverse = beforeReverse;
        ListNode firstNodeToReverse = beforeReverse.next;

        ListNode prev = beforeReverse;
        ListNode curr = firstNodeToReverse;

        for(int i=0; i < right - left +1; i++){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        
        connBeforeReverse.next = prev;
        firstNodeToReverse.next = curr;

        return dummy.next;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna