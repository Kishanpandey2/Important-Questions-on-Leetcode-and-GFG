class Solution {
    public int countPrimes(int n) {
        boolean []prime = new boolean[n] ;
        Arrays.fill(prime,true) ;
        for(int i = 2;i*i<=n;i++){
            if(prime[i]==true)
            {
                for(int j = i*i;j<n;j=j+i)
                prime[j] = false;
            }
        }
        int cnt = 0 ;
        for(int i = 2;i<n;i++)
        {
            if(prime[i]==true)
            cnt++;
        }
        return cnt;
    }
}
