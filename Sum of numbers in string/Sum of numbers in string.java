

class Solution
{
   
    public static long findSum(String str)
    {
       long sum = 0 ;
       String no = "" ;
       
       for(char ch : str.toCharArray())
       {
         if(Character.isDigit(ch))
         no= no+ch ;
         else
         {
             if(!no.equals(""))
             {sum  = sum + Integer.parseInt(no) ;
             no = "";
             }
         }
       }
       if(!no.equals(""))
       sum += Integer.parseInt(no);
       return sum;
    }
    
}
