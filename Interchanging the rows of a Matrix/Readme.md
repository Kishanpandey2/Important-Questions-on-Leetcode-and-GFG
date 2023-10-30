Interchanging the rows of a Matrix  =>
----------------------------------


Given a matrix of dimensions n1 x m1. Interchange its rows in-place such that the first row will become the last row and so on. 

Example 1:

Input:
n1 = 4, m1 = 4
matrix[][] = {{1, 2, 3, 4},
             {5, 6, 7, 8},
             {9, 10, 11, 12},
             {13, 14, 15,16}}
Output: 
13 14 15 16 9 10 11 12 5 6 7 8 1 2 3 4
Explanation:
Matrix after exchanging rows:
13 14 15 16
 9 10 11 12
 5  6  7  8
 1  2  3  4
Note: Output is printed row-wise linearly. 
Example 2:

Input:
n1 = 5, m1 = 3
1 2 3 4 5 6 7 8 9 10 11 12 13 14 15
matrix[][] = {{1, 2, 3},
             {4, 5, 6},
             {7, 8, 9},
             {10, 11, 12},
             {13, 14, 15}}
Output: 
13 14 15 10 11 12 7 8 9 4 5 6 1 2 3
Explanation:
After interchanging rows:
13 14 15
10 11 12
 7  8  9
 4  5  6
 1  2  3

Your Task:
You dont need to read input or print anything. Complete the function interchangeRows() that takes matrix as input parameter and modifies the matrix in-place such that the first row becomes the last row and so on.

Expected Time Complexity: O(n1 * m1)
Expected Auxiliary Space: O(1)

Constraints:
1 <= n1, m1 <= 100
1 <= matrix[i][j] <= 1000

