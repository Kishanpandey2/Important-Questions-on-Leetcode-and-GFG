Maximum prefix sum for a given range  ->
------------------------------------ 

Given an array of N integers and Q queries, each query having a range from index L to R. Find the maximum prefix-sum for the range L to R.
Note: Assume 0 based indexing.

Example 1:

Input: 
a[ ] = {-1, 2, 3, -5} 
Q = 2
L1 = 0, R1 = 3
L2 = 1, R2 = 3
Output:
4 5
Explanation:
The range (0, 3) in the 1st query is {-1, 2, 3, -5}, hence, 
the max prefix-sum will be -1 + 2 + 3 = 4. The range (1, 3) 
in the 2nd query is {2, 3, -5}, hence, the max prefix-sum 
will be 2 + 3 = 5.
Your Task:  
You don't need to read input or print anything. Your task is to complete the function maxPrefixes() which takes the array A[], its size N, array L[] and R[] and their size Q as input parameters and returns a vector storing the required answer for every query.

Expected Time Complexity: O(N*Q)
Expected Auxiliary Space: O(1)

Constraints:
1 ≤ N ≤ 104

-104 ≤ A[i]≤ 104
1 ≤ Q ≤ 104
0 ≤ L[i] ≤ R[i] < N
