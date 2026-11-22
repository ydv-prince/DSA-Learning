# [Digit Square Sequence](https://www.geeksforgeeks.org/problems/happy-number1408/1)
## Easy
Given a positive integer n, generate a sequence by repeatedly replacing the current number with the sum of the squares of its digits.
Find whether this sequence eventually reaches 1. Return true if it does, otherwise return false.
Examples:
Input: n = 19
Output: true
Explanation:
19 = 1² + 9² = 82
82 = 8² + 2² = 68
68 = 6² + 8² = 100
100 = 1² + 0² + 0² = 1
Since the sequence reaches 1, return true.

Input: n = 20
Output: false
Explanation: 20 = 2² + 0² = 4
4 = 4² = 16
16 = 1² + 6² = 37
37 = 3² + 7² = 58
58 = 5² + 8² = 89
89 = 8² + 9² = 145
145 = 1² + 4² + 5² = 42
42 = 4² + 2² = 20
The sequence enters a cycle without reaching 1, so return false.
Constraints:1 ≤ n ≤ 109