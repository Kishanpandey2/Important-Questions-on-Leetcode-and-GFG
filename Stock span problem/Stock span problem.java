
class Solution
{
    
    public static int[] calculateSpan(int price[], int n)
    {
       int  []ans  = new int[n] ;
       
       Deque<Integer>st = new ArrayDeque<>() ;
       
       st.push(0) ;
       ans[0] = 1 ;
       
       int ind = 1 ;
       
       for(int i = 1;i<n;i++)
       {
           while(!st.isEmpty() && price[st.peek()]<= price[i]) st.pop() ;
           
           int span = st.isEmpty() ? i+1 : i - st.peek() ;
           
           ans[ind++] = span ;
           st.push(i);
       }
       
       return ans;
       
    }
  
    
}
