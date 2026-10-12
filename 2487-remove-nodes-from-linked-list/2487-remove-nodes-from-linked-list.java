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
    public ListNode removeNodes(ListNode head) {
        List<Integer> values = new ArrayList<>();
        ListNode curr = head;

        while(curr != null){
            values.add(curr.val);
            curr = curr.next;
        }

        Deque<Integer> stack = new ArrayDeque<>();
        for(int value : values){
            while(!stack.isEmpty() && stack.peekLast() < value){
                stack.pollLast();
            }
            stack.offerLast(value);
        }

        ListNode dummy = new ListNode();
        ListNode current = dummy;

        while(!stack.isEmpty()){
            current.next = new ListNode(stack.pollFirst());
            current = current.next;
        }
        return dummy.next;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna