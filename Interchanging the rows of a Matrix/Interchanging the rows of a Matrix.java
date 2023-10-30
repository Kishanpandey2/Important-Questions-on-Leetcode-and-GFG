class Solution
{
    static void interchangeRows(int matrix[][])
    {
        for(int i =  0;i<matrix.length/2;i++){
            int st = i , end = matrix.length - 1 - i ;
            
            for(int j = 0 ;j<matrix[0].length;j++){
                int t1 = matrix[st][j] ;
                int t2 = matrix[end][j] ;
                matrix[st][j]  = t2 ;
                matrix[end][j] = t1 ;
            }
        }
    }
}
