Reversing the columns of a Matrix  =>
---------------------------------


Given a matrix of dimensions n1 x m1. Reverse its columns in-place such that the last column will become the first column and so on. 

Example 1:

Input:
n1 = 4, m1 = 3
matrix[][] = {{ 1,  2,  3},
              { 5,  6,  7},
              {11, 10,  9},
              {13, 14, 15}}
Output: 3 2 1 7 6 5 9 10 11 15 14 13
Explanation:
Array after exchanging columns:
3 2 1
7 6 5
9 10 11
15 14 13
Example 2:

Input:
n1 = 2, m1 = 5
matrix[][] = {{ 1, 2, 3, 4, 5},
              { 6, 7, 8, 9, 10}}
Output: 5 4 3 2 1 10 9 8 7 6
Explanation:
After reversing the column of matrix
 5 4 3 2 1
10 9 8 7 6
Your Task:
You dont need to read input or print anything. Complete the function reverseCol() that takes matrix as input parameter and modifies it in-place such that the last column will become the first column and so on. 

Expected Time Complexity: O(n1 * m1)
Expected Auxiliary Space: O(1) 

Constraints:
1 <= n1, m1 <= 100
0 <= matrix[i][j] <= 1000

