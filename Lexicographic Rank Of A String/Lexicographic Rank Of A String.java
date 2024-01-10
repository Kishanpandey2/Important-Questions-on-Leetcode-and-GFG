
class Solution
{
    final static int CHAR = 256 ;
    static long mod = 1000000007 ;
    static long fact(int n){
        long f = 1 ;
        
        for(int i = 1;i<=n;i++)
        f= (f*i)%mod ;
        
        return f ;
    }
    static int findRank(String S) 
    {
        
        
        int n  = S.length();
        long factorial= fact(n) ;
        
        int count[] = new int[CHAR] ;
        
        for(char ch : S.toCharArray())
        {
            if(count[ch]==1)return 0 ;
            else
            count[ch] = 1;
        }
        
        for(int i = 1 ;i<CHAR;i++)
        count[i]+=count[i-1] ;
        
        long res = 1 ;
        
        for(int  i = 0 ;i<n-1;i++)
        {
              long mul=fact(n-1-i);
            
            res  = (res+(count[S.charAt(i)]-1) * mul)%mod ;
            
            for(int j = S.charAt(i) ;j<CHAR;j++)
            count[j]-- ;
        }
        return (int)res;
    }
}
