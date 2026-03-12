//2. Add Two Numbers
public class Solution2 {
    public static ListNode AddTwoNumbers(ListNode l1, ListNode l2) {
        // Dummy node simplifies list construction
        ListNode dummy = new ListNode();

        // Initialize carry for addition overflow
        int carry = 0;

        // Pointer to track current position in result list
        ListNode current = dummy;

        // Continue while there are digits to process or carry exists
        while(l1 != null || l2 != null || carry != 0){
            // Get current digit values (0 if node is null)
            int digit1 = (l1 != null) ? l1.val : 0;
            int digit2 = (l2 != null) ? l2.val : 0;

            // Calculate sum of current digits plus carry
            int sum = digit1 + digit2 + carry;

            // Update carry for next iteration (integer division)
            carry = sum / 10;
            
            current.next = new ListNode(sum % 10);

            // Move current pointer to the newly created node
            current = current.next;

            if(l1 != null){
                l1 = l1.next;
            }

            if(l2 != null){
                l2 = l2.next;
            }
        }

        return dummy.next;
    }

    //Main method
    public static void main(String[] args) {
        // int[] values1 = {2,4,3};
        // int[] values2 = {5,6,4};

        // int[] values1 = {0};
        // int[] values2 = {0};

        int[] values1 = {9,9,9,9,9,9,9};
        int[] values2 = {9,9,9,9};

        ListNode l1 = LInkedLIstHelper.buildList(values1);
        ListNode l2 = LInkedLIstHelper.buildList(values2);
        LInkedLIstHelper.printList(l1);
        LInkedLIstHelper.printList(l2);

        ListNode result = AddTwoNumbers(l1, l2);
        LInkedLIstHelper.printList(result);
    }
}
