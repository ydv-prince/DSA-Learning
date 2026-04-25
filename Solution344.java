//344. Reverse String
public class Solution344 {
    public static void reverseString(char[] s) {
        int first = 0;
        int last = s.length-1;

        while(first < last){
            char temp = s[first];
            s[first] = s[last];
            s[last] = temp;

            first++;
            last--;
        }
    }

    public static void main(String[] args) {
        // char[] s = {'h','e','l','l','o'};
        char[] s = {'H','a','n','n','a','h'};

        for(char chr : s){
            System.out.print(chr+" ");
        }

        reverseString(s);
        System.out.println();

        for(char chr : s){
            System.out.print(chr+" ");
        }
    }
}