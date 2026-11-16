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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = null;
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();

        while(l1 != null){
            st1.push(l1.val);
            l1 = l1.next;
        }

        while(l2 != null){
            st2.push(l2.val);
            l2 = l2.next;
        }

        int carry = 0;
        while(!st1.isEmpty() || !st2.isEmpty() || carry > 0){
            int digit1 = st1.isEmpty() ? 0 : st1.pop();
            int digit2 = st2.isEmpty() ? 0 : st2.pop();

            carry += digit1 + digit2;
            ListNode newNode = new ListNode(carry%10);

            // Insert at the beginning
            newNode.next = ans;
            ans = newNode;
            carry /= 10;
        }
        return ans;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna