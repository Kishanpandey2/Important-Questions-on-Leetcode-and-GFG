
class Solution
{
   
    public static int binarySubstring(int a, String str)
    {
       int ones = -1 ;
       
       for(char ch  :str.toCharArray())
       if(ch == '1')ones++ ;
       
       return (ones*(ones+1))/2 ;
    }
}
