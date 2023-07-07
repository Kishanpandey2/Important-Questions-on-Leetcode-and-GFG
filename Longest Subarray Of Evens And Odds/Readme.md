Longest Subarray Of Evens And Odds  =>
----------------------------------



You are given an array of size n. Find the maximum possible length of a subarray such that its elements are arranged alternately either as even and odd or odd and even .

Example 1:

Input:
n = 5
a[] = {10,12,14,7,8}
Output: 3
Explanation: The max length of subarray
is 3 and the subarray is {14 7 8}. Here 
the array starts as an even element and 
has odd and even elements alternately.
Example 2:

Input:
n = 2
a[] = {4,6}
Output: 1
Explanation: The array contains {4 6}. 
So, we can only choose 1 element as 
that will be the max length subarray.
Your Task:
 You don't need to take any input. Just complete the function maxEvenOdd() that returns the maximum length.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).

Constraints:
1 <= n <= 106
1 <= Ai <= 103
