
class Solution
{
    public static boolean isRotated(String str1, String str2)
    {
        if(str1.length() != str2.length()  || str1.length() <2)return false;
        
        int n = str1.length();
        String temp = "" ;
        
        temp = str1.substring(n-2,n) + str1.substring(0,n-2) ;
        
        if(str2.equals(temp))return true ;
        
        temp = str1.substring(2,n) + str1.substring(0,2) ;
        if(str2.equals(temp))return true ;
        return false;
    }
    
}
