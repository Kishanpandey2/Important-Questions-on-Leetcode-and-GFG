

class Solution
{
    public static String concatenatedString(String s1,String s2)
    {
        Set<Character>st1 = new HashSet<>() ;
        Set<Character>st2 = new HashSet<>() ;
        
        for(char ch : s1.toCharArray())
        st1.add(ch);
        
        for(char ch : s2.toCharArray())
        st2.add(ch);
        
        StringBuilder sb = new StringBuilder() ;
        
        for(char ch : s1.toCharArray()) 
        if(!st2.contains(ch))
        sb.append(ch) ;
        
        for(char ch : s2.toCharArray()) 
        if(!st1.contains(ch))
        sb.append(ch) ;
        
        return sb.length()== 0 ? "-1": sb.toString();
    }
}
