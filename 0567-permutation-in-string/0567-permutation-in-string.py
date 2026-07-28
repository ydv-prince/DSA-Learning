class Solution:
    def checkInclusion(self, s1: str, s2: str) -> bool:
        if len(s1) > len(s2):
            return False

        freq1 = [0]*26
        freq2 = [0]*26

        for ch in s1:
            freq1[ord(ch) - ord("a")] += 1

        left=0

        for right in range(len(s2)):
            freq2[ord(s2[right]) - ord("a")] += 1

            if right - left + 1 > len(s1):
                freq2[ord(s2[left]) - ord("a")] -= 1
                left += 1

            if right - left + 1 == len(s1):
                if freq1 == freq2:
                    return True

        return False

# Synced seamlessly with LeetHub Pro
# Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
# Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna