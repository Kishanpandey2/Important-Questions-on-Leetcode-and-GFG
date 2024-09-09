Maximum difference between node and its ancestor  =>
------------------------------------------------

Given a Binary Tree, you need to find the maximum value which you can get by subtracting the value of node B from the value of node A, where A and B are two nodes of the binary tree and A is an ancestor of B. 

Examples :

Input:
    5
 /    \
2      1
Output: 4
Explanation:The maximum difference we can get is 4, which is bewteen 5 and 1.
Input:
      1
    /    \
   2      3
           \
            7
Output: -1
Explanation:The maximum difference we can get is -1, which is between 1 and 2.
Expected Time Complexity: O(N).
Expected Auxiliary Space: O(H).
Note: H is the height of the tree.

Constraints:
2 <= Number of edges <= 104
0 <= Data of a node <= 105

Note: The Input/Output format and Examples given are used for the system's internal purpose, and should be used by a user for Expected Output only. As it is a function problem, hence a user should not read any input from the stdin/console. The task is to complete the function specified, and not to write the full code.

