Rabin Karp - Pattern Searching  =>
------------------------------


Given a string S and a pattern P of lowercase characters. The task is to check if the pattern is present in string or not.

Example 1:

Input:
S = aabaacaadaabaaba
P = aaba
Output: Yes
Explanation: You can find the patter at
starting at index 12.
Example 2:

Input:
S = aabaacaadaabaaba
P = asdfa
Output: No
Explanation: Pattern doesn't exist in
the given string S.
Your Task:
You need to complete the function search which takes 3 arguments(S, P and prime q) and returns true if the pattern is found else returns false.

Expected Time Complexity: O(N + M).
Expected Auxiliary Space: O(1).
Note: N = |S|, M = |P|.

Constraints:
1 <= |S|, |P| <= 104

