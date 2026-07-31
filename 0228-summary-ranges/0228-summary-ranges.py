class Solution:
    def summaryRanges(self, nums: List[int]) -> List[str]:

        def format_range(start_idx: int, end_idx: int) -> str:
            if start_idx == end_idx:
                return str(nums[start_idx])
            return f'{nums[start_idx]}->{nums[end_idx]}'
        

        current_idx = 0
        array_length = len(nums)
        result = []

        while current_idx < array_length:
            range_end_idx = current_idx

            while range_end_idx + 1 < array_length and nums[range_end_idx + 1] == nums[range_end_idx] + 1:
                range_end_idx += 1
          
            result.append(format_range(current_idx, range_end_idx))
          
            current_idx = range_end_idx + 1
      
        return result

# Synced seamlessly with LeetHub Pro
# Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
# Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna