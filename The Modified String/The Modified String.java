

class Solution
{
    public static long modified(String a)
    {
       int cnt = 1;
       int res  = 0; 
       if(a.length() <3)return 0 ;
       for(int i = 1;i<a.length();i++)
       {
           if(a.charAt(i)==a.charAt(i-1))
           cnt++ ;
           else if(cnt>=3)
           {
               res += ((cnt+1)/2  - 1) ;
               cnt = 1 ;
           }
           else cnt = 1;
       }
       
       if(cnt>=3)
       res += ((cnt+1)/2  - 1);
       return res;
    }
}
