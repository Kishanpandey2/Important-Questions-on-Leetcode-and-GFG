
class Solution {
    public static int prec(char ch){
        switch(ch){
            case '+':
            case '-':
                return 1;
             case '*':
            case '/':
                return 2;
             case '^':
           return 3;
        }
        
        return -1 ;
    }
    public static String infixToPostfix(String exp) {
       String res = new String("") ;
       
       Deque<Character>st = new ArrayDeque<>() ;
       
       for(int i = 0 ;i<exp.length() ;i++){
           char ch = exp.charAt(i) ;
           
           if(Character.isLetterOrDigit(ch))
           res += ch ;
           
           else if(ch == '(')st.push(ch) ;
           
           else if(ch == ')')
           {
               while(!st.isEmpty() && st.peek()!= '(')
               {
                   res += st.peek() ;
                   st.pop();
               }
               st.pop() ;
           }
           
           else {
               while(!st.isEmpty() && prec(ch)<= prec(st.peek()))
               {
                   res += st.peek() ;
                   st.pop() ;
               }
               st.push(ch) ;
           }
       }
       
       
       while(!st.isEmpty())
       {
           res += st.peek() ;
           st.pop() ;
       }
       return res;
    }
}
