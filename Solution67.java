//67. Add Binary
public class Solution67 {
    public static String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();

        int idxA = a.length()-1;
        int idxB = b.length()-1;
        int carry = 0;

        while(idxA >= 0 || idxB >= 0 || carry > 0){
            int digitA = idxA >= 0 ? a.charAt(idxA) - '0' : 0;
            int digitB = idxB >= 0 ? b.charAt(idxB) - '0' : 0;

            int sum = digitA + digitB + carry;

            result.append(sum % 2);

            carry = sum / 2;

            idxA--;
            idxB--;
        }
        return result.reverse().toString();
    }

    public static void main(String[] args) {
        // String a = "11", b = "1";
        String a = "1010", b = "1011";

        System.out.println(addBinary(a, b));
    }
}
