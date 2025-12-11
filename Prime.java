public class Prime {
    public static boolean IsPrime(int num){
        if(num == 2){
            return true;
        }
        for(int div = 2; div <= Math.sqrt(num); div++){
            if(num % div == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.print(IsPrime(2));
    }
}
