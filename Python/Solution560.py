#560. Subarray Sum Equals K
from typing import List
from collections import Counter

class Solution560:
    def subarraySum(self, nums: List[int], k: int) -> int:
        prefix_sum_count = Counter({0: 1})

        result = 0
        current_sum = 0

        for num in nums:
            current_sum += num

            result += prefix_sum_count[current_sum - k]

            prefix_sum_count[current_sum] += 1

        return result

# nums = [1, 1, 1]
# k = 2

nums = [1,2,3]
k = 3

sol = Solution560()
print(sol.subarraySum(nums, k))
