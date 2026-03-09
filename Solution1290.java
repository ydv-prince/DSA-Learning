//1290. Convert Binary Number in a Linked List to Integer
public class Solution1290 {
    public static int getDecimalValue(ListNode head) {
        int decimalValue = 0;
        while(head != null){
            //decimalValue = decimalValue * 2 + head.val
            decimalValue = (decimalValue << 1) | head.val;
            head = head.next;
        }
        return decimalValue;
    }

    //Main method
    public static void main(String[] args) {
        // int[] values = {1,0,1};
        // int[] values = {1,0,1,0,0};
        int[] values = {0};

        ListNode head = LInkedLIstHelper.buildList(values);
        LInkedLIstHelper.printList(head);
        int result = getDecimalValue(head);
        System.out.println(result);
    }
}
