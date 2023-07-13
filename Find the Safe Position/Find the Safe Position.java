class Solution {
    static int safePos(int n, int k) {
       return 1+help(n,k);
    }
    static int help(int n ,int k){
        if(n == 0 )
       return 0;
       
       return (help(n-1,k)+k)%n;
    }
};
