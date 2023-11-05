

class Solution {
    public static int findMinOperation(int N, int[][] mat) {
        
        int max = Integer.MIN_VALUE ;
        int rowSum, colSum ;
        for(int i = 0 ;i<N;i++){
            rowSum = 0 ; colSum = 0 ;
        for(int j = 0 ;j<N;j++){
           rowSum += mat[i][j] ;
           colSum += mat[j][i];
        }
         max = Math.max(max,Math.max(rowSum,colSum));
         
        }
        int ans = 0;
        
        for(int i = 0 ;i<N;i++)
        {
            int temp = 0 ;
            for(int j = 0;j<N;j++)
            {
                temp+= mat[i][j] ;
            }
            ans += (max-temp) ;
            
        }
        
        return ans ;
    }
}
        
