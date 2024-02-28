
class Solution
{
   
    public static String removeConsecutiveDuplicates(String str)
    {
        Deque<Character>st = new ArrayDeque<>() ;
        
        for(char ch : str.toCharArray())
        {
            while(!st.isEmpty() && st.peek() == ch)
            st.pop() ;
            
            st.push(ch) ;
        }
        
        StringBuilder sb=new StringBuilder() ;
        
        while(!st.isEmpty())
        {
            char ch = st.pop() ;
            sb.append(ch);
        }
        
        
        return sb.reverse().toString();
    }
}
