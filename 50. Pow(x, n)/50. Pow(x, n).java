class Solution {
    public double myPow(double x, int n) {
        
        double ans = 1.0 ;
        long temp= n;
        if(n<0)
        temp*= -1 ;
        while(temp>0)
        {
            if(temp%2 == 1)
            {
                ans *= x ;
                temp -= 1 ;
            }
            else
            {
                x*=x ;
                temp/=2 ;
            }
        }
       if(n<0)
       ans = 1.0/ans ;
        return ans ;
    }
}
