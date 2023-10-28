Exchange matrix columns  =>
-----------------------


You are given a matrix of dimensions (n1 x m1). You have to exchange its first column with the last column.

Example 1:

Input:
n1 = 4, m1 = 4
matrix[][] = {{1, 2, 3, 4},
              {5, 6, 7, 8},
              {9, 10, 11, 12},
              {13, 14, 15,16}}
Output: 
4 2 3 1 8 6 7 5 12 10 11 9 16 14 15 13
Explanation:
Matrix is as follow:
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16
After exchanging first column with 
last column, we have matrix as follows:
4 2 3 1
8 6 7 5
12 10 11 9
16 14 15 13
 

Example 2:

Input:
n1 = 2, m1 = 3
matrix[][] = {{4, 3, 2},
              {1, 5, 6}}
Output: 2 3 4 6 5 1
Explanation:
Matrix is as follows:
4 3 2
1 5 6
After exchanging columns matrix will be:
2 3 4
6 5 1

Your Task:
You don't need to take input or print anything. Complete the function exchangeColumns() that takes the matrix as input parameter and modifies it in place by exchanging its first column with its last column.

Expected Time Complexity: O(n1 * m1)
Expected Auxiliary Space: O(1)

Constraints:
1 <= n1, m1<= 100
0 <= arr[i] <= 100
