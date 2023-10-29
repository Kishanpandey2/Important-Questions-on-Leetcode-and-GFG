class Solution
{
    
    static void reverseCol(int matrix[][])
    {
        for(int i= 0 ;i<matrix.length;i++){
            int st = 0 , end = matrix[i].length-1; 
             while(st<end)
             {
                 int t1 = matrix[i][st] ;
                 int t2 = matrix[i][end] ;
                 matrix[i][end ] = t1 ;
                 matrix[i][st] = t2 ;
                 
                 
                 st++ ; end-- ;
             }
        }
    }
     
}
