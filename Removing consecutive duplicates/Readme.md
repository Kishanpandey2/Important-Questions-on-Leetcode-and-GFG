Removing consecutive duplicates  =>
-------------------------------


You are given string str. You need to remove the consecutive duplicates from the given string using a Stack.
 

Example 1:

Input: 
aaaaaabaabccccccc

Output: 
ababc

Explanation: 
The order is in the following way 6->a, 1->b, 2->a, 1->b, 7->c. 
So, only one element from each group will remain and rest all are removed.
Therefore, final string will be:- ababc.

Example 2:

Input: 
abbccbcd

Output: 
abcbcd

Explanation: 
The order is in the following way 1->a, 2->b, 2->c, 1->b, 1->c, 1->d.
So, only one element from each group will remain and rest all are removed.
Therefore, final string will be:- abcbcd. 
Your Task:
This is a function problem. You need to complete the function removeConsecutiveDuplicates() that takes a string as a parameter and returns the modified string. The printing is done automatically by the driver code.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(N).

Constraints:
1 <= |str| <= 103

