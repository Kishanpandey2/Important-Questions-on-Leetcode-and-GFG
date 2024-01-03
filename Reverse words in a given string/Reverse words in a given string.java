

class Solution 
{
    String reverseWords(String S)
    {
        StringBuilder sb = new StringBuilder() ;
        
        StringBuilder mid = new StringBuilder() ;
        
        int i = S.length()-1 ;
        while(i>=0)
        {
            if(S.charAt(i)=='.')
            {
                mid.reverse() ;
                sb.append(mid+".") ;
                mid.setLength(0) ;
            }
            else
            mid.append(S.charAt(i)) ;
            
            i--;
        }
        
        mid.reverse() ;
        sb.append(mid) ;
        
        return sb.toString();
    }
}
