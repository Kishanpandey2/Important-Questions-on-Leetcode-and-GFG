class Solution
{
        static void exchangeColumns(int matrix[][])
    {
        for(int i = 0 ;i<matrix.length ;i++)
        swap(matrix,i,matrix[0].length -1 ) ;
    }
    static void swap(int [][]mat ,int i,int j){
        int t1= mat[i][0] ;
        int t2 = mat[i][j] ;
        
        mat[i][0] = t2 ;
        mat[i][j] = t1;
    }
}
