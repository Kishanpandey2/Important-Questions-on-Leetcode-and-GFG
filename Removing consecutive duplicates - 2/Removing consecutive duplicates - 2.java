

class Solution
{
   
    public static String removePair(String str)
    {
        Deque<Character>st = new ArrayDeque<>() ;
        
        for(char ch : str.toCharArray())
        {
            if(!st.isEmpty() && st.peek()==ch)
            st.pop() ;
            else
            st.push(ch) ;
        }
        
        StringBuilder sb= new StringBuilder() ;
        
        while(!st.isEmpty())
        sb.append(st.pop()) ;
        
        return sb.reverse().toString() ;
    }
}
