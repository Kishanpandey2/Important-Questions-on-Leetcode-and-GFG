Closer to sort  =>
---------------


Given an array arr[](0-based indexing) of N integers which is closer sorted (defined below) and an element x. The task is to find the index of element x if it is present. If not present, then print -1.
Closer Sorted: The first array is sorted, but after sorting some elements are moved to either of the adjacent positions, i.e, maybe to the arr[i+1] or arr[i-1].

Example 1:

Input: N = 5, A[] = [3 2 10 4 40], x = 2
Output: 1
Explanation: 2 is present at index 1 
(0-based indexing) in the given array.
Example 2:

Input: N = 4, A[] = [2 1 4 3], x = 5
Output: -1
Explanation: 
5 is not in the array so the output will 
be -1.

Your Task:
This is a function problem. You only need to complete the function closer() that arr, N, and x as parameters and returns the index. If the element is not present, return -1.

Expected Time Complexity: O(Log(N)).
Expected Auxiliary Space: O(1).

Constraints:
1 <= N <= 106
1 <= arr[i],x <= 109

Note: You may assume that the array does not contain any duplicate elements. 
