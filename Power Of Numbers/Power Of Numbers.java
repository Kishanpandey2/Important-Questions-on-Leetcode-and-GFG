// using Binary Exponentiation 


class Solution
{
 long mod = 1000000007;       
    long power(int N,int R)
    {
      if(R==0)
      return 1 ;
      long temp = power(N,R/2)%mod ;
      long ans = (temp%mod*temp%mod)%mod ;
      if(R%2 ==1)
      ans = (ans%mod*N%mod)%mod ;
      
      return ans%mod ;
      
        
    }

}
