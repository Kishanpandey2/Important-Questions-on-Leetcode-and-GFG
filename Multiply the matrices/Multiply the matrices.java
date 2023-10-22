
class Solution
{
    static int[][] multiplyMatrix(int A[][], int B[][])
    {
        if(A[0].length != B.length)
        return new int[0][0] ;
        int [][]mat = new int[A.length][B[0].length] ;
        
        for(int i = 0;i<A.length;i++){
            for(int j = 0 ; j<B[0].length;j++){
                int k  =0 ; int temp = 0 ;
                while(k<A[0].length){
                 temp+= A[i][k] * B[k][j] ;
                 k++;
                }
                mat[i][j] = temp ;
                
            }
        }
        
        return mat ;
    }
}
