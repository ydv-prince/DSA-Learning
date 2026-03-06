//142. Linked List Cycle II

class Solution142 {
    static ListNode detectCycle(ListNode head) {
        if (head == null) return null;
        
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                ListNode start = head;
                while(slow != start){
                     start = start.next;
                     slow = slow.next;
                }
                return start;
            }
        }
        return null;
    }

    //Helper function for building ListNode + creating cycle
    public static ListNode buildList(int[] values, int pos) {
        if (values.length == 0) return null;

        ListNode head = new ListNode(values[0]);
        ListNode current = head;
        ListNode cycleNode = null;

        if (pos == 0) cycleNode = head;

        for (int i = 1; i < values.length; i++) {
            current.next = new ListNode(values[i]);
            current = current.next;

            if (i == pos) {
                cycleNode = current;
            }
        }

        // Create cycle if pos != -1
        if (pos != -1) {
            current.next = cycleNode;
        }

        return head;
    }



    //Main method
    public static void main(String[] args) {
    // int[] values = {3,2,0,-4};
    // int pos = 1;

    int[] values = {1,2};
    int pos = 0;

    ListNode head = buildList(values, pos);

    ListNode cycleStart = detectCycle(head);

    if (cycleStart != null) {
        System.out.println("Cycle starts at: " + cycleStart.val);
    } else {
        System.out.println("No cycle");
    }
}
}