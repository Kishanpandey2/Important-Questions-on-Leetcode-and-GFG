class Solution
{    
    public static boolean isAnagram(String a,String b)
    {
        if(a.length() != b.length())return false;
      int count[] = new int[26] ;
        for(int i =  0 ;i<a.length() ;i++)
        {
            count[a.charAt(i)-'a']++;
            count[b.charAt(i)-'a']--;
        }
        
        for(int i :count)
        if(i>0)return false;
        
        return true;
    }
}
