Balanced Tree Check  =>
 -------------------

 
Given a binary tree, find if it is height balanced or not.  A tree is height balanced if difference between heights of left and right subtrees is not more than one for all nodes of tree. 

Examples:

Input:
      1
    /
   2
    \
     3 
Output: 0
Explanation: The max difference in height of left subtree and right subtree is 2, which is greater than 1. Hence unbalanced
Input:
       10
     /   \
    20   30 
  /   \
 40   60
Output: 1
Explanation: The max difference in height of left subtree and right subtree is 1. Hence balanced. 
Constraints:
1 <= Number of nodes <= 105
1 <= Data of a node <= 109

Expected time complexity: O(N)
Expected auxiliary space: O(h) , where h = height of tree

