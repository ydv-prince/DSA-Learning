class Solution {
    public int totalNumbers(int[] digits) {
        Set<Integer> uniqueNumbers = new HashSet<>();
        int arrayLength = digits.length;

        for (int onesIndex = 0; onesIndex < arrayLength; ++onesIndex) {
            if (digits[onesIndex] % 2 == 1) {
                continue;
            }

            for (int tensIndex = 0; tensIndex < arrayLength; ++tensIndex) {
                if (onesIndex == tensIndex) {
                    continue;
                }


                for (int hundredsIndex = 0; hundredsIndex < arrayLength; ++hundredsIndex) {

                    if (digits[hundredsIndex] == 0 || 
                        hundredsIndex == onesIndex || 
                        hundredsIndex == tensIndex) {
                        continue;
                    }

                    int threeDigitNumber = digits[hundredsIndex] * 100 + 
                                         digits[tensIndex] * 10 + 
                                         digits[onesIndex];
                    uniqueNumbers.add(threeDigitNumber);
                }
            }
        }

        return uniqueNumbers.size();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna