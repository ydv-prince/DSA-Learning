// 28. Find the Index of the First Occurrence in a String
// class Solution28 {
//     public static int strStr(String haystack, String needle) {
//         int m = haystack.length();
//         int n = needle.length();
//         for(int i=0; i<m-n+1; i++){
//             if(haystack.substring(i, i+n).equals(needle)){
//                 return i;
//             }
//         }
//         return -1;
//     }
//     public static void main(String[] args) {
//         // String haystack = "sadbutsad", needle = "sad";
//         String haystack = "leetcode", needle = "leeto";
//         System.out.println(strStr(haystack, needle));
//     }
// }

class Solution28 {
    public static int strStr(String haystack, String needle) {
        if(needle.length() == 0){ //or needle.isEmpty
            return 0;
        }
        int haystackLength = haystack.length();
        int needleLength = needle.length();

        int haystackPointer = 0;
        int needlePointer = 0;
        while(haystackPointer < haystackLength){
            if(haystack.charAt(haystackPointer) == needle.charAt(needlePointer)){
                if(needleLength == 1){
                    return haystackPointer;
                }
                haystackPointer++;
                needlePointer++;
            }else{
                haystackPointer = haystackPointer - needlePointer + 1;
                needlePointer = 0;
            }

            if(needlePointer == needleLength){
                return haystackPointer - needlePointer;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        // String haystack = "sadbutsad", needle = "sad";
        String haystack = "leetcode", needle = "leeto";
        System.out.println(strStr(haystack, needle));
    }
}