
class match
{
    static int d= 256;
   
    static boolean search(String pat, String txt, int q)
    {
       int h = 1  ;
       
       int n = txt.length()  ;
       int m = pat.length() ;
       
       for(int i = 1;i<=m-1 ;i++)
         h = (d*h)%q ;
         
         int p = 0 , t = 0 ;
         
         for(int i = 0 ;i<m ;i++)
         {
             p = (p*d+pat.charAt(i))%q ;
             t = (t*d+txt.charAt(i))%q ;
         }
         
         for(int i = 0;i<=n-m;i++)
         {
             if(p==t)
             {
                 boolean flag = true ;
                for(int j = 0 ;j<m;j++){
                     if(pat.charAt(j)!=txt.charAt(i+j))
                     {
                         flag = false;
                         break;
                     }
                     
                 }
                 if(flag)
                 return true ;
                 
             }
             if(i<n-m)
             {
                 t = (d*(t-txt.charAt(i)*h)+txt.charAt(i+m))%q ;
                if(t<0)
                t += q ;
             }
         }
         
         return false;
    }
}
