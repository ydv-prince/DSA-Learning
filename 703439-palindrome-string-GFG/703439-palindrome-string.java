class Solution {
    boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        
        while(left < right){
            char leftChar = s.charAt(left);
            char rightChar = s.charAt(right);
            
            if(!Character.isLetterOrDigit(leftChar)){
                left++;
            }
            else if(!Character.isLetterOrDigit(rightChar)){
                right--;
            }
            else if(leftChar != rightChar){
                return false;
            }
            else{
                left++;
                right--;
            }
            
        }
        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna