// LinkedListHelper.java
public class LInkedLIstHelper {
    // Build list from array
    public static ListNode buildList(int[] values) {
        if (values == null || values.length == 0) return null;

        ListNode head = new ListNode(values[0]);
        ListNode current = head;

        for (int i = 1; i < values.length; i++) {
            current.next = new ListNode(values[i]);
            current = current.next;
        }

        return head;
    }

    // Print list normally
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println("null");
    }

    // Print limited (for cycle problems)
    public static void printListLimited(ListNode head, int limit) {
        int count = 0;
        while (head != null && count < limit) {
            System.out.print(head.val + " ");
            head = head.next;
            count++;
        }
        System.out.println("...");
    }

    // Build list with cycle (pos = index where tail connects)
    public static ListNode buildListWithCycle(int[] values, int pos) {
        if (values == null || values.length == 0) return null;

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

        if (pos != -1) {
            current.next = cycleNode;
        }

        return head;
    }
}