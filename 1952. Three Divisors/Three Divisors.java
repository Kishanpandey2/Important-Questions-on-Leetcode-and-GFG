class Solution {
    public boolean isThree(int n) {
        int c = 0 ;
        for(int i = 2 ;i<n ;i++){
            if(n%i==0)
            c++;
        }
        if(c==0)
        return false ;
        else if(c==1)
        return true ;
        return false ;
    }
}
