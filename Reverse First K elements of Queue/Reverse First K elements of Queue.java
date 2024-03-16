
class GfG {
    // Function to reverse first k elements of a queue.
    public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
       Stack<Integer>st = new Stack<>() ;
       Queue<Integer> ans = new LinkedList<>() ;
       
       for(int i = 0 ;i<k;i++)
       st.push(q.poll());
       
       while(!st.isEmpty())
       ans.add(st.pop());
       
       for(int i : q)
       ans.add(i);
       
     return ans;  
    }
}
