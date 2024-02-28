
class Solution
{
    
    static boolean ispar(String x)
    {
        Deque<Character>st = new ArrayDeque<>() ;
        
        for(char ch : x.toCharArray())
        {
            if(ch == '(' || ch == '{' || ch == '[')
            st.push(ch) ;
            else
            { 
                if(st.isEmpty())return false;
                else if(matching(st.peek(),ch)==false)
                return false;
                else
                st.pop();
            }
        }
        return st.isEmpty();
    }
    
    public static boolean matching(char ch1  , char ch2){
        return (ch1=='(' && ch2==')') || (ch1=='{' && ch2=='}') ||(ch1=='[' && ch2==']') ;
    }
}
