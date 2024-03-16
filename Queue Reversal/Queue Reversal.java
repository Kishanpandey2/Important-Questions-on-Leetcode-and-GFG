class GfG{
    //Function to reverse the queue.
    public Queue<Integer> rev(Queue<Integer> q){
        // Iterative solution
        
        Queue<Integer> ans = new LinkedList<>() ;
        
        Stack<Integer>st = new Stack<>() ;
        for(int i : q)
        st.push(i) ;
        
      while(!st.isEmpty())
      ans.add(st.pop());
        
        return ans;
        
        // recursive
        
        /* Queue<Integer> ans = new LinkedList<>() ;
        reverse(q);
        for(int i:q)
        ans.add(i);
        return ans;*/
        
    }
    
   /* void reverse(Queue<Integer>q )
    {
        if(q.isEmpty())return ;
        
        int x = q.poll() ;
        
        reverse(q) ;
        q.add(x);
    }*/
}
