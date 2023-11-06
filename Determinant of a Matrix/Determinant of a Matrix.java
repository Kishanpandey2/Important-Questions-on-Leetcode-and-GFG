
class Solution
{
    static int determinantOfMatrix(int mat[][], int n)
    {
     int ans = 0 ;
     
     int sign = 1;
     if(n == 1)return mat[0][0] ;
     int[][] temp = new int[n][n] ;
     
     for(int k = 0 ;k<n;k++){
         coFactor(mat,temp,0,k,n) ;
         
         ans += sign * mat[0][k]*determinantOfMatrix(temp,n-1) ;
         
         sign = -sign ;
     }
     
     return ans;
    }
    static void coFactor(int [][]mat, int temp[][],int p,int q,int n){
        int i = 0 , j = 0 ;
        
        for(int r = 0 ;r<n;r++){
            for(int c = 0 ;c<n;c++){
                if(r!=p && c!= q)
                {
                    temp[i][j++] = mat[r][c] ;
                    
                    if(j == n-1)
                    {
                        j = 0  ; i++;
                    }
                }
            }
        }
    }
}

