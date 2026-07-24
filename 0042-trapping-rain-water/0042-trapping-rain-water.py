class Solution:
    def trap(self, height: List[int]) -> int:

        left = 0
        right = len(height) - 1

        leftMax = 0
        rightMax = 0

        water = 0

        while left < right:

            if height[left] < height[right]:

                if height[left] >= leftMax:
                    leftMax = height[left]
                else:
                    water += leftMax - height[left]

                left += 1

            else:

                if height[right] >= rightMax:
                    rightMax = height[right]
                else:
                    water += rightMax - height[right]

                right -= 1

        return water

# Synced seamlessly with LeetHub Pro
# Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
# Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna