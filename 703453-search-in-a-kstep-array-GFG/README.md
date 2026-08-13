# [Search in a K-Step Array](https://www.geeksforgeeks.org/problems/searching-in-an-array-where-adjacent-differ-by-at-most-k0456/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article)
## Easy
Given a step array arr[], a step value k, and an integer x, find the first index of x in the array. If x is not present, return -1.
Note: A K-Step array is an array where the absolute difference between any two adjacent elements is at most k.
For example, arr[]= [4, 6, 7, 9]&nbsp; with k= 2 is a step array because the difference between consecutive elements is ≤ 2.
Examples :
Input: arr[] = [4, 5, 6, 7, 6], k = 1, x = 6
Output: 2
Explanation: In the array arr, 6 is present at index 2. So, return 2.

Input: arr[] = [20, 40, 50], k = 20, x = 70
Output: -1 Explanation: As there is no occurrence of 70. So, return -1.
Constraints:1 ≤ arr.size ≤ 1051 ≤ k ≤ 1001 ≤ arr[i], x ≤ 105