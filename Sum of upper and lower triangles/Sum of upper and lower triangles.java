class Solution
{
    static ArrayList<Integer> sumTriangles(int matrix[][], int n)
    {
            int upper  = 0 , lower =0  ;
            ArrayList<Integer>ans =new ArrayList<>() ;
            
            for(int i =0 ;i<n;i++)
            {
                for(int j = 0 ;j<n;j++)
              {  if(j>=i)
                upper += matrix[i][j] ;
                if(i>=j)
                lower+= matrix[i][j] ;
              }
            }
            
            ans.add(upper ) ; ans.add(lower) ;
            
            return ans ;
    }
}
