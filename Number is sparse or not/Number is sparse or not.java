
class Solution
{
   
    public static boolean isSparse(int n)
    {
       int c =0  ;
       while(n!=0){
           if((n&1)!=0)
           c++ ;
           else 
           c=0 ;
           if(c==2)
           return false ;
          n>>=1 ;
       }
       return true ;
    }
    
}
