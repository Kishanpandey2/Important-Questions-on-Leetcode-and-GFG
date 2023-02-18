class Solution{
    public static int largestPowerof2inRange(int n){
        int c = 0 ;
        while((1<<c)<=n){
            c++;
        }
        return c-1 ;
    }
    
    public static int countSetBits(int n){
        if(n==0)
        return n ;
    int x = largestPowerof2inRange(n) ;
    int bitTill2x = x *  (1<<(x-1)) ;
    int bitFrom2xTilln = n - (1<<x)+1 ;
    int rest = n- (1<<x) ;
        int ans = bitTill2x+bitFrom2xTilln+countSetBits(rest);
        return ans ;
    }
}
