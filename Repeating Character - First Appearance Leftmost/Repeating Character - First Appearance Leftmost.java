
class Solution
{
    static int repeatedCharacter(String S)
    {
        int count[] = new int[256] ;
        
        for(char ch : S.toCharArray())
        count[ch]++ ;
        
        for(int i = 0;i<S.length() ;i++)
        if(count[S.charAt(i)] > 1)
        return i ;
        
        return -1;
    }
}
