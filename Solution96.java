public class Solution96{
    public static int numTrees(int n) {
        int[] count = new int[n+1];
        count[0] = 1;

        for(int nodeCount = 1; nodeCount<= n; nodeCount++){
            for(int leftSubtreeSize = 0; leftSubtreeSize < nodeCount; leftSubtreeSize++){
                int rightSubtreeSize = nodeCount - leftSubtreeSize -1;
                count[nodeCount] += count[leftSubtreeSize] * count[rightSubtreeSize];
            }
        }
        return count[n];
    }

    public static void main(String[] args) {
        // int n = 3;
        int n = 1;

        System.out.println(numTrees(n));
    }
}