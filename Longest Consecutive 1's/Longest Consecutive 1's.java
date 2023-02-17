class Solution{
    
  
    public static int maxConsecutiveOnes(int n) {
        
         int max =Integer.MIN_VALUE ;
        int c = 0 ;
        while(n!=0){
            if((n&1)!=0)
            c++ ;
            else
            c=0 ;
            if(c>max)
            max = c ;
            n>>=1 ;
        }
        return max;
        
    }
}
