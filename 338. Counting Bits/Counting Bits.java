class Solution {
    int setBit(int n){
        int []table = new int[265] ;
        table[0] = 0 ;
        for(int i = 1;i<256 ;i++){
            table[i]= table[i&(i-1)]+1 ;
        }
        return table[n&255]+table[(n>>8) & 255]+ table[(n>>16)&255]+table[(n>>24) ] ;

    }
    public int[] countBits(int n) {
        int []ans = new int[n+1] ;
        ans[0]= 0 ;
        for(int i = 1;i<=n;i++){
            ans[i] = setBit(i) ;
        }
        return ans ;
    }
}
