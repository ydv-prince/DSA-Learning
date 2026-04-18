//38. Count and Say
public class Solution38 {
    public static String countAndSay(int n) {
        String currentSequence = "1";

        while (--n > 0) {
            StringBuilder nextSequence = new StringBuilder();
          
            for (int currentIndex = 0; currentIndex < currentSequence.length();) {
                int endIndex = currentIndex;
                while (endIndex < currentSequence.length() && 
                       currentSequence.charAt(endIndex) == currentSequence.charAt(currentIndex)) {
                    endIndex++;
                }
              
                int count = endIndex - currentIndex;
                nextSequence.append(count);
              
                nextSequence.append(currentSequence.charAt(currentIndex));
              
                currentIndex = endIndex;
            }
          
            currentSequence = nextSequence.toString();
        }
      
        return currentSequence;
    }

    public static void main(String[] args) {
        // int n = 4;
        int n = 1;

        System.out.println(countAndSay(n));
    }
}
