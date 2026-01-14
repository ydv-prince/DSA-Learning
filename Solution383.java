//383. Ransom Note
public class Solution383 {
    // public static  boolean canConstruct(String ransomNote, String magazine) {
    //     if(ransomNote.length() > 0 && magazine.length() == 0) return false;

    //     int[] letterFrequency = new int[26];
    //     for(int i=0; i<magazine.length(); i++){
    //         char currentChar = magazine.charAt(i);
    //         int index = currentChar - 'a';
    //         letterFrequency[index]++;
    //     }

    //     for(int i=0; i<ransomNote.length(); i++){
    //         char currentChar = ransomNote.charAt(i);
    //         int index = currentChar - 'a';
    //         letterFrequency[index]--;

    //         if(letterFrequency[index] < 0){
    //             return false;
    //         }
    //     }
    //     return true;
    // }


    public static boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length() > 0 && magazine.length() == 0) return false;

        int[] letterFrequency = new int[26];
        for(char chr : magazine.toCharArray()){
            letterFrequency[chr - 'a']++;
        }

        for(char chr : ransomNote.toCharArray()){
            letterFrequency[chr - 'a']--;

            if(letterFrequency[chr - 'a'] < 0){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        String ransomNote = "a", magazine = "b";
        // String ransomNote = "aa", magazine = "ab";
        // String ransomNote = "aa", magazine = "aab";
        System.out.println(canConstruct(ransomNote, magazine));
    }
}
