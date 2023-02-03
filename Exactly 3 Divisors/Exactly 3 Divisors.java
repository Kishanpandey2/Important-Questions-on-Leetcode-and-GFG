class Solution
{
    boolean prime(int n){
        if(n==2 ||n ==3)
        return true ;
        if(n%2==0 ||n%3==0)
        return false ;
         for(int i = 5;i * i <=n;i=i+6){
             if(n%i==0 || n%(i+2)==0)
             return false;
         }
         return true ;
    }
    
    public int exactly3Divisors(int N)
    {
        
        int c = 0 ;
        for(int i = 2;i*i <= N;i++){
            if(prime(i))
            c++ ;
        }
        return c ;
    }
}
