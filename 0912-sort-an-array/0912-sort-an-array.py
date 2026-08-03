class Solution:
    def sortArray(self, nums: List[int]) -> List[int]:

        def quick_sort(left: int, right: int) -> None:
            if left >= right:
                return

            pivot = nums[randint(left, right)]

            i = left-1
            j = right+1
            k = left

            while k < j:
                if nums[k] < pivot:
                    i += 1
                    nums[i], nums[k] = nums[k], nums[i]
                    k += 1
                elif nums[k] > pivot:
                    j -= 1
                    nums[j], nums[k] = nums[k], nums[j]
                else:
                    k += 1
            
            quick_sort(left, i)
            quick_sort(j, right)
            
        quick_sort(0, len(nums)-1)
        return nums


# Synced seamlessly with LeetHub Pro
# Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
# Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna