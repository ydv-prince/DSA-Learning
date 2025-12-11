public class Star {
    public static void main(String[] args){
        for(int line = 0; line <= 10; line++){
            for(int star = 1; star <= line; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}