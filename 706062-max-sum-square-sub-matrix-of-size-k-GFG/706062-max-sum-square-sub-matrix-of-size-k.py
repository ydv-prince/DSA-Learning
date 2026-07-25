class Solution:
    def maximumSum(self, mat, k):
        # code here
        n = len(mat)
        col_sum = [0]*n
        res = float('-inf')
        
        for i in range(n):
            for j in range(n):
                col_sum[j] += mat[i][j]
                if i >= k:
                    col_sum[j] -= mat[i-k][j]
            
            if i >= k-1:
                sum=0
                for j in range(n):
                    sum += col_sum[j]
                    
                    if j >= k:
                        sum -= col_sum[j-k]
                    if j >= k-1:
                        res = max(res, sum)
        return res

# Synced seamlessly with LeetHub Pro
# Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
# Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna