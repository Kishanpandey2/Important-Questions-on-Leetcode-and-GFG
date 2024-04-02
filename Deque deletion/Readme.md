Deque deletion  =>
--------------


Given a Deque dqe of size N containing non-negative integers.

Complete below functions depending type of query as mentioned and provided to you (indexing starts from 0):
1. eraseAt(X): this function should remove the element from specified position X in deque.
2. eraseInRange(start, end): this function should remove the elements in range start (inclusive), end (exclusive) specified in the argument of the function.
Note: If start is equal to end then simply return.
3. eraseAll(): remove all the elements from the deque.

Example 1:

Input:
5
1 2 4 5 6
1 2

Output: 
1 2 5 6 

Explanation: 
Here the query type is 1 
and the position is 2. So we remove 
element at position 2. The element at 
position 2 is 1 2 4 5 6. So, we remove 
4 and get 1 2 5 6.
Example 2:

Input: 
4
1 2 3 4
2 1 3

Output: 
1 4 

Explanation: 
Here the query type is 2 
and the range is [1, 3). So we need to 
delete 1 2 3 4. Remember that end is 
exclusive. So the updated dequeue is 1 4.
Example 3:

Input:
3
1 2 3
3

Output: 
Empty

Explanation: 
Here the query is of type 3 
so we remove all the elements of dequeue.
Your Task:
Complete the functions eraseAt() which takes dequeue and a postion as input parameters, eraseInRange() which takes dequeue, start(inclusive) and end(exclusive) as input parameters and eraseAll() which takes a dequeue as input parameter.

Expected Time Complexity: O(N), for all operations
Expected Auxilliary Space: O(1)

Constraints:
1 ≤ N ≤ 105
