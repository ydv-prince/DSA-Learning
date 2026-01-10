//69. Sqrt(x)
public class Solution69 {
    public static int mySqrt(int x) {
        if(x<2){
            return x;
        }
        int left = 1;
        int right = x;
        int index = -1;
        while(left<=right){
            int mid = left+(right-left)/2;
            if(mid > x/mid){
                index = mid;
                right = mid-1;;
            }
            else{
                left = mid+1;
            }
        }
        if(index == -1){
            return x;
        }
        return index-1;
    }

    public static void main(String[] args) {
        // int x = 17;
        // int x = 4;
        int x = 8;
        System.out.println(mySqrt(x));
    }
}
