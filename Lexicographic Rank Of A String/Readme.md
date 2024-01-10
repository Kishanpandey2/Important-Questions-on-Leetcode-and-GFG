Lexicographic Rank Of A String  =>
------------------------------
You are given a string S of lowercase characters, find the rank of the string amongst its permutations when sorted lexicographically. Return 0 if the characters are repeated in the string.
Note: Return the rank%1000000007 as the answer as rank might overflow.

Example 1:

Input:
S = abc
Output: 1
Explanation: In 'abc' when we sort all the
permutations in lexicographic order 'abc'
will be at the first position.
Example 2:

Input:
S = acb
Output: 2
Explanation: In 'acb' .The
lexicographically sorted permutations
with letters 'a', 'c', and 'b' will be
at second position. 
Your Task:
You only need to complete the function findRank that takes string S as a parameter and returns the rank.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(N).

Constraints:
1 ≤ |S| ≤ 26

 
