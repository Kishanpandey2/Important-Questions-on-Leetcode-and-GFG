class Solution
{
    // Pair Class
    static class Pair{
         long x;
         long y;
         
         Pair(long x, long y){
             this.x = x;
             this.y = y;
         }
     }
    
    public static Pair findRepeating(Long arr[],int n)
    {
       if(n== arr[n-1]-arr[0]+1)return new Pair(-1,-1);
       
       int l = 0 , h = n-1 ;
       while(l<=h)
       {
           int mid = l+(h-l)/2 ;
           
           if(arr[mid]>=mid+1)
           l=mid+1;
           else
           h= mid-1;
       }
       long freq = n-arr[n-1]+1;
       Pair p = new Pair(arr[l],freq);
       
       return p;
    }  
};
