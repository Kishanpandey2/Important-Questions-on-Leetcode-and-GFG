class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int x = text1.length() ;
        int y =  text2.length() ;
      int [][]dp = new int[x+1][y+1] ;
   
   //  for(int []i:dp)  // if you use memorigation in dp you must use fill dp with -1 but in case of tabular algo , don't need to fill with -1 .dp automatically fill with 0 in java.
    //  Arrays.fill(i,-1) ;
   
        return   lcsUtil(x,y,text1,text2,dp) ;
    }

// this is  a memorigation method of the dp . .. this is also called top-down approach 
/*int lcsUtil(int x, int y, String s1, String s2, int [][]dp){   
        if(x==0 || y ==0)
    return 0 ;
    if(dp[x][y]!=-1)
    return dp[x][y] ;
    
    if(s1.charAt(x-1)==s2.charAt(y-1))
    return dp[x][y]= 1+lcsUtil(x-1,y-1,s1,s2,dp);
    else
    return dp[x][y]= Math.max(lcsUtil(x,y-1,s1,s2,dp),lcsUtil(x-1,y,s1,s2,dp)) ;
    }*/

  
  // this is the tabular method of the dp .this is also called buttom - up approach .
    int lcsUtil(int x,int y , String s1,String s2, int[][]dp){
        for(int i = 1 ;i<=x;i++){
            for(int j = 1 ;j<=y;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1))
                dp[i][j]=dp[i-1][j-1]+1 ;
                else
                dp[i][j]= Math.max(dp[i-1][j],dp[i][j-1]) ;
            }
           
        }
         return dp[x][y] ;
    }
}
