//2058. Find the Minimum and Maximum Number of Nodes Between Critical Points
public class Solution2058{
    public static int[] nodesBetweenCriticalPoints(ListNode head) {
        int[] result = {Integer.MAX_VALUE, 0 };

        int firstCriticalIndex = -1;
        int lastCriticalIndex = -1;

        int currIndex = 1;
        while(head.next != null && head.next.next != null){
            int preVal = head.val;
            int currVal = head.next.val;
            int nextVal = head.next.next.val;

            boolean isLocalMinima = currVal < preVal && currVal < nextVal;
            boolean isLocalMaxima = currVal > preVal && currVal > nextVal;

            if(isLocalMinima || isLocalMaxima){
                if(lastCriticalIndex == -1){
                    firstCriticalIndex = currIndex;
                    lastCriticalIndex = currIndex;
                }
                else{
                    result[0] = Math.min(result[0], currIndex - lastCriticalIndex);

                    lastCriticalIndex = currIndex;

                    result[1] = Math.max(result[1], lastCriticalIndex - firstCriticalIndex);
                }
            }
            currIndex++;
            head = head.next;
        }

        // if(firstCriticalIndex == lastCriticalIndex){
        if (result[0] == Integer.MAX_VALUE){
            return new int[]{-1, -1};
        }

        return result;
    }

    public static void main(String[] args) {
        // int[] values = {3,1};
        // int[] values = {5,3,1,2,5,1,2};
        int[] values = {1,3,2,2,3,2,2,2,7};

        ListNode head = LInkedLIstHelper.buildList(values);
        int[] result = nodesBetweenCriticalPoints(head);
        Solution350.printArr(result);
    }
}
