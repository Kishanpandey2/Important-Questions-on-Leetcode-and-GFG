class Solution
{
     
    public static int ans = 0 ;
    public static int digitalRoot(int n)
    {
        
        if(n==0)
        return 0 ;
        
        ans = (n%10+digitalRoot(n/10)) ;
        if(ans >9)
        ans = ans %9 ;
        
        if(ans == 0 )
        ans = 9 ;
        return ans ;
        
    }
}
