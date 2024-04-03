Rotate Deque By K  =>
-----------------  


Given a Deque deq of size N containing non-negative integers and a positive integer K, the task is to rotate elements of the deque by K places in a circular fashion. There will be two rotations which you have to implement depending on the type rotating query. Below is the description of rotating type and value of K for which you have to rotate in circular way:
Type-1. right_Rotate_Deq_ByK(): this function should rotate deque by K places in a clockwise fashion.
Type-2. left_Rotate_Deq_ByK(): this function should rotate deque by K places in an anti-clockwise fashion.

Example 1:

Input:
6
1 2 3 4 5 6
1 2

Output: 
5 6 1 2 3 4 

Explanation: 
The dequeue is 1 2 3 4 5 6. 
The query type is 1 and k is 2. So, we 
need to right rotate dequeue by 2 times. 
In 1 right rotation we get 6 1 2 3 4 5. 
In another we get 5 6 1 2 3 4.
Example 2:

Input: 
6
1 2 3 4 5 6 
2 2 

Output: 
3 4 5 6 1 2 

Explanation: 
The dequeue is 1 2 3 4 5 6. 
The query type is 2 and k is 2. So, we 
need to left rotate dequeue by 2 times. 
In 1 left rotation we get 2 3 4 5 6 1. 
In another we get 3 4 5 6 1 2.
Your Task:
Since this is a functional problem you don't have to worry about the input. You just have to complete the functions right_Rotate_Deq_ByK() and left_Rotate_Deq_ByK() takes dequeue, size of dequeue, and a value K as input parameters and perform the operations. The functions are of a void type so don't return anything. The updated deque will be printed by the driver code.

Expected Time Complexity: O(N)
Expected Auxilliary Space: O(1)

Constraints:
1 ≤ N ≤ 105

