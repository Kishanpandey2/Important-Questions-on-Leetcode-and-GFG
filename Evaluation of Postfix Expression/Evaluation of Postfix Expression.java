
class Solution
{
 
    public static int evaluatePostFix(String S)
    {
        Deque<Integer>st = new ArrayDeque<>() ;
        
        for(char ch : S.toCharArray())
        {
            
            
           if(Character.isDigit(ch))
            st.push(ch - '0');
            
            else
            {
                int val1 = st.pop();
                int val2 = st.pop();
                
                switch(ch)
                {
                    case '+':
                    st.push(val2+val1);
                    break;
                    
                    case '-':
                    st.push(val2- val1);
                    break;
                    
                    case '/':
                    st.push(val2/val1);
                    break;
                    
                    case '*':
                    st.push(val2*val1);
                    break;
              }
            }
        }
        return st.pop();
    }
}
