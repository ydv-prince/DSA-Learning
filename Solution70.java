//70. Climbing Stairs
public class Solution70{
    public static int climbStairs(int n) {
        int two = 0;
        int one = 1;

        for(int step=0; step<n; step++){
            int curr = two + one;
            
            two = one;
            one = curr;
        }

        return one;
    }

    public static void main(String[] args) {
        // int n = 2;
        int n = 3;

        System.out.println(climbStairs(n));
    }
}
