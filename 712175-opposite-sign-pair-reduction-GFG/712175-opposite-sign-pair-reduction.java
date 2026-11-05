class Solution {
    public ArrayList<Integer> reducePairs(int[] arr) {
        ArrayList<Integer> st = new ArrayList<>();
        
        for(int num : arr){
            while (!st.isEmpty() && st.get(st.size() - 1) * num < 0){
                int top = st.get(st.size() - 1);
                
                // Top > num
                if (Math.abs(top) > Math.abs(num)) {
                    num = top;
                    st.remove(st.size() - 1);
                }
                
                // num > top
                else if (Math.abs(top) < Math.abs(num)) {
                    st.remove(st.size() - 1);
                }

                // num == top
                else {
                    st.remove(st.size() - 1);
                    num = 0;
                    break;
                }
            }

            // if(num)
            if (num != 0)
                st.add(num);
        }

        return st;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna