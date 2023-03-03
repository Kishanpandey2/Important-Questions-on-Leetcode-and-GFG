
class Solution{
    static int matrixMultiplication(int N, int a[])
    {
        int [][]dp = new int[N][N] ;
        
        for(int len= 2 ;len<N;len++){
            for(int row = 0,col = len ;row<N-len;row++,col++){
                dp[row][col]= Integer.MAX_VALUE ;
                for(int k = row+1 ;k<col;k++){
                    dp[row][col]= Math.min(dp[row][col], dp[row][k]+dp[k][col]+a[k]*a[col]*a[row]);
                }
            }
        }
        return dp[0][N-1];
        
    }
}
