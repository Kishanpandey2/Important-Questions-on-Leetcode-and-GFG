
class Solution {
    static Long numGame(Long n) {
        long ans = 1L;
        long mod = 1000000007L ;
        for(long i = 1;i<=n;i++)
        ans = lcm(ans,i) % mod;
        return ans%mod;
    }
    static long gcd(long a ,long b)

    {

        if(b == 0)

            return a;

        return gcd( b , a%b );

    }
     
    static long lcm(long a ,long b)

    {

        long lcm = (a * b) /gcd(a,b);

        return lcm;

    }
};
