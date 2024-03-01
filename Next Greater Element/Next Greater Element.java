
class Solution
{
    
    public static long[] nextLargerElement(long[] arr, int n)
    { 
        Deque<Long>st = new ArrayDeque<>() ;
        long ans[] = new long[n]; 
        
        st.push(arr[n-1]) ;
        ans[n-1] = -1 ;
        int cnt = 1 ;
        
        for(int  i = n-2;i>=0;i--)
        {
            while(!st.isEmpty() && st.peek()<=arr[i])
            st.pop() ;
            
            ans[i] = st.isEmpty()?-1:st.peek() ;
            st.push(arr[i]) ;
        }
        
       
        
        return ans;
        
     } 
    
   
}
