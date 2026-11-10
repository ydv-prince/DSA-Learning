class Solution {
    public String reverseWords(String s) {
        List<String> wordList = new ArrayList<>();
        int length = s.length();

        for (int index = 0; index < length;) {
            // Skip leading spaces
            while (index < length && s.charAt(index) == ' ') {
                index++;
            }

            if (index < length) {
                StringBuilder currentWord = new StringBuilder();
                int wordStartIndex = index;
              
                while (wordStartIndex < length && s.charAt(wordStartIndex) != ' ') {
                    currentWord.append(s.charAt(wordStartIndex));
                    wordStartIndex++;
                }
              
                wordList.add(currentWord.toString());
              
                index = wordStartIndex;
            }
        }

        Collections.reverse(wordList);
        return String.join(" ", wordList);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna