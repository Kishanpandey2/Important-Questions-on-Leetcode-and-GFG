class Solution {
    static String divAndSub(int N) {
         if(N==1)
         return "Arya" ;
          
          int game[] = new int[N+1] ;
          game[0] = 0 ;
          
          for(int i = 1;i<=N;i++)
          {
              game[i] = 0 ;
              for(int move = 2;move<=5;move++)
              {
                  if(game[i/move]==0)
                  game[i] = 1 ;
                  if(i-move>=0 && game[i-move]==0)
                  game[i] = 1;
              }
          }
          if(game[N]==1)
          return "Jon";
          return "Arya";
    }
};
