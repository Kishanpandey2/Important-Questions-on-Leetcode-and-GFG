
class Solution
{
    static void rotateby90(int matrix[][], int n) 
    { 
       int mat[][] = new int[n][n] ;
       
       for(int i = 0 ;i<n;i++)
       {
           for(int j = 0 ;j<n;j++)
           mat[n-j-1][i] = matrix[i][j] ;
       }
       
       for(int i = 0 ;i<n;i++)
       {
           for(int j = 0 ;j<n;j++)
           matrix[i][j] = mat[i][j] ;
       }
    }
    
    
}
