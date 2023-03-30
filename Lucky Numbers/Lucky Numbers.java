
class Solution
{ 
    public static boolean isLucky(int n)
    {
    return     helperFunction(n,2) ;
    }
    
    public static boolean helperFunction(int n, int cnt) {
        if(n<cnt)
        return true ;
        
        if(n%cnt ==0)
        return false ;
        
        return helperFunction(n-(n/cnt),cnt+1);
    }
    
}
