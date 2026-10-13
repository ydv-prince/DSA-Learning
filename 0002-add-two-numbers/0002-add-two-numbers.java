/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     public int val;
 *     public ListNode next;
 *     public ListNode(int val=0, ListNode next=null) {
 *         this.val = val;
 *         this.next = next;
 *     }
 * }
 */

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode dummy = new ListNode(0);
        int carry = 0;
        ListNode curr = dummy;

        ListNode curr1 = l1;
        ListNode curr2 = l2;

        while (curr1 != null || curr2 != null || carry != 0) {

            int digit1 = (curr1 != null) ? curr1.val : 0;
            int digit2 = (curr2 != null) ? curr2.val : 0;

            int sum = digit1 + digit2 + carry;

            carry = sum / 10;

            curr.next = new ListNode(sum % 10);
            curr = curr.next;

            if (curr1 != null) curr1 = curr1.next;
            if (curr2 != null) curr2 = curr2.next;
        }

        return dummy.next;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna