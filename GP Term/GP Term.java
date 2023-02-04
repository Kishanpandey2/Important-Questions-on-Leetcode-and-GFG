class Solution
{
    
    public double termOfGP(int A,int B,int N)
    {
       
        if(N==1)
        return A*1.0 ;
        if(N==2)
        return B*1.0  ;
        double cr = (double)B/A ;
        double ans = A * ( Math.pow(cr,N-1)) ;
        return ans ;
    }

}
