
class Solution
{
    static ArrayList<Integer> spirallyTraverse(int mat[][], int r, int c)
    {
        ArrayList<Integer> ans = new ArrayList<>() ;
        
        int top = 0 , right = c-1, bottom = r-1, left = 0 ;
        
        if(r == 1){
            for(int i = 0 ;i<c;i++)
            ans.add(mat[0][i]) ;
            return ans ;
        }
        else if(c==1)
        {
            for(int i = 0;i<r;i++)
            ans.add(mat[i][0]) ;
            return ans;
        }
        else
        {
            while(top<=bottom && left<=right){
            for(int i = left ;i<=right ;i++)
            ans.add(mat[top][i]) ;
            top++ ;
            
            for(int i = top;i<=bottom;i++)
            ans.add(mat[i][right]) ;
            right-- ;
            
            if(top<=bottom)
            {
                for(int i = right ;i>=left;i--)
                ans.add(mat[bottom][i]) ;
                bottom-- ;
            }
            if(left<=right)
            {
                for(int i = bottom ;i>=top;i--)
                ans.add(mat[i][left]) ;
                
                left++;
            }
            
            }
        }
        
        
        return ans;
    }
}
