
class solve{
    

    static ArrayList<String> generate(int N)
    {
       Queue<String>q = new LinkedList<>() ;
       q.add("1") ;
       
       ArrayList<String> ans = new ArrayList<>() ;
       
       for(int i = 1;i<=N;i++)
       {
           String no = q.poll() ;
          
           ans.add(no) ;
           q.offer(no+'0') ;
           q.offer(no+'1') ;
          
       }
       return ans;
       
    }
    
}
