# [Minimum Days to Make m Bouquets](https://www.geeksforgeeks.org/problems/minimum-days-to-make-m-bouquets/1)
## Medium
In a row of flowers, each flower blooms on a specific day. Given an integer array arr[], where arr[i] denotes the day on which the flower at position i blooms.
To make a bouquet, you need to collect k adjacent flowers that have already bloomed. Each flower can be used in at most one bouquet.
Find the minimum number of days required to make m bouquets. If it is impossible to do so, return -1.
Examples:
Input: arr[] = [3, 4, 2, 7, 13, 8, 5], m = 3, k = 2
Output: 8
Explanation: We need to make 3 bouquets, each consisting of 2 adjacent flowers.
-&gt; By day 8, all flowers have bloomed except the flower at position 5 (1-indexed).
-&gt; Form the 1st bouquet using the first 2 flowers.
-&gt; Form the 2nd bouquet using the next 2 flowers.
-&gt; Form the 3rd bouquet using the last 2 flowers.
Input: arr[] = [5, 5, 5, 5, 10, 5, 5], m = 2, k = 3,
Output: 10
Explanation: We need to make 2 bouquets, each consisting of 3 adjacent flowers.
-&gt; By day 5, all flowers have bloomed except the flower at position 5 (1-indexed).
-&gt; We can form the 1st bouquet using the first 3 bloomed flowers.
-&gt; It is not possible to form the 2nd bouquet now.
-&gt; By day 10, all the flowers have bloomed.
-&gt; We can then form 2 bouquets, each consisting of 3 adjacent flowers.
Input: m = 3, k = 2, arr[] = [1, 10, 3, 10, 2]Output: -1Explanation: We need to make 3 bouquets, each consisting of 2 flowers.
-&gt; This requires a total of 6 flowers.
-&gt; There are only 5 flowers available.
-&gt; Therefore, it is impossible to make the required bouquets.
Constraints:1 ≤ k ≤ arr.size() ≤ 1051 ≤ m ≤ 1051 ≤ arr[i] ≤ 109