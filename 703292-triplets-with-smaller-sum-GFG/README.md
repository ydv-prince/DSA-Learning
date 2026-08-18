# [Triplets with Smaller Sum](https://www.geeksforgeeks.org/problems/count-triplets-with-sum-smaller-than-x5549/1)
## Medium
Given an array arr[] of distinct integers&nbsp;and a value sum, find the count of triplets (i, j, k), having (i&lt;j&lt;k)&nbsp;with the sum of (arr[i] + arr[j] + arr[k])&nbsp;smaller than the given value sum.
Examples :
Input: sum = 2, arr[] = [-2, 0, 1, 3]
Output:  2
Explanation: Triplets with sum less than 2 are (-2, 0, 1) and (-2, 0, 3). 

Input: sum = 12, arr[] = [5, 1, 3, 4, 7]
Output: 4
Explanation: Triplets with sum less than 12 are (1, 3, 4), (5, 1, 3), (1, 3, 7) and (5, 1, 4).
Constraints:1&nbsp;≤ sum&nbsp;≤ 1053 ≤ arr.size() ≤ 103-103&nbsp;≤ arr[i]&nbsp;≤ 103