Check if a String is Subsequence of Other =>
-----------------------------------------


Given two strings A and B, find if A is a subsequence of B. A subsequence is a sequence that can be derived from another sequence by deleting some elements without changing the order of the remaining elements.


Example 1:

Input:
A = AXY 
B = YADXCP
Output: False
Explanation: A is not a subsequence of B
as 'Y' appears before 'A'.

Example 2:

Input:
A = gksrek
B = geeksforgeeks
Output: True
Explanation: A is a subsequence of B.
 

Your Task:  
You dont need to read input or print anything. Complete the function isSubSequence() which takes A and B as input parameters and returns a boolean value denoting if A is a subsequence of B or not. 

 

Expected Time Complexity: O(N) where N is length of string B.
Expected Auxiliary Space: O(1)


Constraints:
1<= |A|,|B| <=106

