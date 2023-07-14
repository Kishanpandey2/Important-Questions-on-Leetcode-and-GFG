Divide and Subtract Game  =>
-------------------------



Jon and Arya are playing a game. Rules of game as follows:
  They have a single number N initially.
   Both will play an alternate move. Jon starts first.
   Both will play each move optimally.
   In each move, they can perform only one of these operation
          1. Divide that number by 2, 3, 4 or 5 and take floor of result.
          2. Subtract that number by 2, 3, 4 or 5.
   If after making a move the number becomes 1, the player who made the move automatically loses the game.
   When number becomes zero, the game will stop and the player who can't make a move loses the game.

 

Example 1:

Input:
N = 3
Output:
Jon
Explanation:
Jon will just subtract 3 from initial
number and win the game.
Example 2:

Input:
N = 6
Output:
Arya
Explanation:
Jon will divide by 3 and then in next step
Arya will subtract by 2 and win the game.
 

Your Task:
You don't need to read input or print anything. Your task is to complete the function divAndSub() which takes an Integer N as input and returns a string denoting who won the game.

 

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(N)

 

Constraints:
1 <= N <= 105

