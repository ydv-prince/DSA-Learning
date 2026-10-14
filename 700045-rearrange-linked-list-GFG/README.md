# [Rearrange Linked List](https://www.geeksforgeeks.org/problems/rearrange-a-linked-list/1)
## Medium
Given a singly linked list, the task is to rearrange it in a way that all odd position nodes are together and all even position nodes are together. (Considering 1-based indexing.)Note: You should place all odd-positioned nodes first and then the even-positioned ones. Also, the relative order of odd-positioned nodes and even-positioned nodes should be maintained.&nbsp;Examples:Input: head: 1-&gt;2-&gt;3-&gt;4
Output: 1-&gt;3-&gt;2-&gt;4 
Explanation: Odd elements are 1, 3 and even elements are 2, 4. Hence, resultant linked list is 1-&gt;3-&gt;2-&gt;4 Input: head: 1-&gt;2-&gt;3-&gt;4-&gt;5
Output: 1-&gt;3-&gt;5-&gt;2-&gt;4 
Explanation: Odd elements are 1, 3, 5 and even elements are 2, 4. Hence, resultant linked list is 1-&gt;3-&gt;5-&gt;2-&gt;4. Constraints:1 ≤ number of nodes ≤ 1040 ≤ node-&gt;data ≤ 103