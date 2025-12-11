public class Strings {

    //Q1. Palindrome check
    public static boolean isPalindrome(String str){
        for(int i = 0; i < str.length()/2; i++){
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;
    }

    //Q2. Shortest path
    public static float getShortestPath(String path){
        int x = 0, y = 0;
        for(int i = 0; i < path.length(); i++){
            //North
            if(path.charAt(i) == 'N'){
                x++;
            }
            else if(path.charAt(i) == 'S'){
                y--;
            }
            else if(path.charAt(i) == 'E'){
                x++;
            }
            else if(path.charAt(i) == 'W'){
                x--;
            }
        }
        int x2 = x*x;
        int y2 = y*y;
        return (float)Math.sqrt(x2+y2);
    }

    //Sub String
    public static String substring(String str, int si, int ei){
        String substring = "";
        for(int i = 0; i < ei; i++){
            substring += str.charAt(i);
        }
        return substring;
    }

    //Q3. Largest String lexicographically
    public static String largestString(String str[]){
        String largest = str[0];
        for(int i = 0; i < str.length; i++){
            if(largest.compareTo(str[i]) < 0){
                largest = str[i];
            }
        }
        return largest;
    }

    //String Builder
    public static String alphabet(){
        StringBuilder sb = new StringBuilder("");
        for(char i = 'a'; i <= 'z'; i++){
            sb.append(i);
        }
        return sb.toString();
    }

    //Q4. Given String - Convert each the first letter of words to uppercase
    public static String toUppercase(String str){
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i = 1; i < str.length(); i++){
            if(str.charAt(i) == ' ' && i < str.length() - 1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                sb.append(str.charAt(i));
            }
        }

        return sb.toString();
    }

    //Q5. String Compression
    public static String compress(String str){
        String newString = "";
        for(int i = 0; i < str.length(); i++){
            Integer count = 1;
            while(i < str.length() - 1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            newString += str.charAt(i);
            if(count > 1){
                newString += count.toString();
            }
        }
        return newString;
    }

    //HW - String Compression using String Builder
    public static String compressString(String str){
        StringBuilder newString = new StringBuilder("");
        for(int i = 0; i < str.length(); i++){
            Integer count = 1;
            while(i < str.length() -1 && str.charAt(i) == str.charAt(i + 1)){
                count++;
                i++;
            }
            newString.append(str.charAt(i));
            if(count > 1){
                newString.append(count);
            }
        }
        return newString.toString();
    }

    //Main method
    public static void main(String[] args) {
        // char arr[] = {'a','b','c','d'};
        // String str = "noon";
        // String str2 = new String("Racecar");

        // //  **Strings are IMMUTABLE**
        // System.out.println(str+"\n"+str2);
        // System.out.println(isPalindrome(str));
        // System.out.println(isPalindrome(str2));
        // System.out.println(str2.charAt(3));

        // String str1 = "apple";
        // String str2 = "apple";
        // String str3 = new String("apple");

        // System.out.println(str1 == str2);
        // System.out.println(str1 == str3);
        // System.out.println(str1.equals(str3));

        // String path = "WENS";
        // System.out.println(getShortestPath(path));

        // //Sub-string
        // String str = "HelloWorld";
        // System.out.println(substring(str, 0, 7));

        // //In-Built substring
        // System.out.println(str.substring(0, 5));

        // String str[] = {"Apple", "Banana", "Mango", "Grapes"};
        // String str2[] = {"Apple", "banana", "Mango", "Grapes"};
        // System.out.println(largestString(str));
        // System.out.println(largestString(str2));

        // System.out.println(alphabet());
        // System.out.println(alphabet().length());

        // String str = "hello I am prince YADAV";
        // System.out.println(toUppercase(str));

        // String str = "deecaaabb";
        // System.out.println(compress(str));

        // String str = "deecaaabb";
        // System.out.println(compressString(str));
    }
}
