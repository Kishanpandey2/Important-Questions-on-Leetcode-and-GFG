Count Non-Repeated Elements  =>
---------------------------


Hashing is very useful to keep track of the frequency of the elements in a list.

You are given an array of integers. You need to print the count of non-repeated elements in the array.

Example 1:

Input:
10
1 1 2 2 3 3 4 5 6 7

Output: 
4

Explanation: 
4, 5, 6 and 7 are the 
elements with frequency 1 and rest 
elements are repeated so the number 
of non-repeated elements are 4.
Example 2:

Input:
5
10 20 30 40 10

Output: 
3

Explanation: 
20, 30, 40 are the 
elements with the frequency 1 and 
10 is the repeated element to 
number of non-repeated elements 
are 3.
Your Task:
You don't need to read input or print anything. You only need to complete the function countNonRepeated() that takes array arr[] and its size n as parameters and returns the count of non-repeating elements in the array. 

Expected Time Complexity: O(n).
Expected Auxiliary Space: O(n).

Constraints:
1 <= n <= 103
0 <= arri <= 107
