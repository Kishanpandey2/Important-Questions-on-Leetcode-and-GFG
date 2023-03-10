Maximum XOR of two numbers in an array  =>
--------------------------------------

Given an array of non-negative integers of size N. Find the maximum possible XOR between two numbers present in the array.

Example 1:

Input:
Arr = {25, 10, 2, 8, 5, 3}
Output: 28
Explanation:
The maximum result is 5 ^ 25 = 28.

Example 2:

Input :
Arr = {1, 2, 3, 4, 5, 6, 7}
Output : 7
Explanation :
The maximum result is 1 ^ 6 = 7.
Your task :
You don't need to read input or print anything. Your task is to complete the function max_xor() which takes an array of integers and it's size as input and returns maximum XOR of two numbers in an array.
 
Expected Time Complexity: O(NlogN)
Expected Auxiliary Space: O(N)
 
Constraints:
1 <= N <=5*104
1<= A[i] <= 106
