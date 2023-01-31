
class Solution{

    public int digitsInFactorial(int n){
        if(n==1 || n==0)
        return 1 ;
        double log = 0 ;
        for(int i = 2;i<=n;i++){
            log += Math.log10(i) ;
        }
       int  ans =(int) Math.floor(log) ;
        return ans+1 ;
    }
}
