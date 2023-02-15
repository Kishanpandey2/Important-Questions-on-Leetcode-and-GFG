class Solution
{
    public List<String> AllPossibleStrings(String str)
    {
        StringBuilder sb  ;
        PriorityQueue<String>pq = new PriorityQueue<>() ;
        List<String>ans = new ArrayList<>() ;
         int len = str.length() ;
        int psize= 1<<len ;
        for(int i = 1; i<psize ;i++){
            sb = new StringBuilder() ;
            for(int j = 0 ;j<str.length() ;j++){
                if((i &( 1<<j)) !=0)
                    sb.append(str.charAt(j));
            }
            pq.add(sb.toString()) ;
        }
         while(!pq.isEmpty())
        { ans.add(pq.peek() ) ;
        pq.poll();
        }
       return  ans;
    }
}
