Kth smallest element  =>
---------------------


Given an array arr[] of N positive integers and a number K. The task is to find the kth smallest element in the array.

 

Example 1:

Input: 
N = 5, K = 3
arr[] = {3,5,4,2,9}

Output: 
4

Explanation: 
Third smallest element in the array is 4.
Example 2:

Input:
N = 5, k = 5
arr[] = {4,3,7,6,5}

Output: 
7

Explanation: 
Fifth smallest element in the array is 7.

Your Task:
You  don't need to read inputs or print anything. Complete the method kthSmallest() which takes array arr[], size of the array n and value k as input parameters and returns kth smallest element.

Constraints:
1 <= N <= 106
1 <= arr[i] <= 106
1 <= K <= N
Array do not contains duplicates.

Expected Time Complexity: O(NlogK)
Expected Auxilliary Space: O(K)
