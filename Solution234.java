//234. Palindrome Linked List
public class Solution234 {
    public static boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

            ListNode secondHalf = reverse(slow);
            ListNode firstHalf = head;

            while(secondHalf != null){
                if(firstHalf.val != secondHalf.val){
                    return false;
                }
                firstHalf = firstHalf.next;
                secondHalf = secondHalf.next;
            }
        return true;
    }

    //Function to reverse the list
    private static ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode current = head;

        while(current != null){
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    //Main method
    public static void main(String[] args) {
        int[] values = {1,2,2,1};
        // int[] values = {1,2};

        ListNode head = LInkedLIstHelper.buildList(values);
        LInkedLIstHelper.printList(head);
        System.out.println(isPalindrome(head));
    }
}