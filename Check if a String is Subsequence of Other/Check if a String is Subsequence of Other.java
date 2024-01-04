
class Solution
{
    public static boolean isSubSequence(String A, String B)
    {
       
       int i = 0 ; 
       
       for(int j = 0;j<B.length() && i<A.length();j++)
       {
           if(A.charAt(i)==B.charAt(j))
           i++;
       }
       
       return i==A.length();
    }
};
