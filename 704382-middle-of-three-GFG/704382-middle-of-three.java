class Solution {
    int middle(int a, int b, int c) {
        if(a > b){
            if(b > c){
                return b;
            }
            else{
                if(a> c){
                    return c;
                }
                else{
                    return a;
                }
            }
        }
        else{
            if(a > c){
                return a;
            }
            else{
                if(b > c){
                    return c;
                }
                else{
                    return b;
                }
            }
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna