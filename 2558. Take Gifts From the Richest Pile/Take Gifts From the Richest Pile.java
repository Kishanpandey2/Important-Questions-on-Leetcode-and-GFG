class Solution {
    public long pickGifts(int[] gifts, int k) {
        long ans = 0 ;
         PriorityQueue<Long>pq = new PriorityQueue<>(Collections.reverseOrder()) ;
         for(int i :gifts){
 pq.offer((long)i) ;}
         while(k>0){
             long cur = pq.poll();
            pq.offer((long)Math.floor(Math.sqrt(cur)) );
            k--;
        }
        while(!pq.isEmpty()){
        ans+=pq.poll() ;
        
        }
        return ans ;
    }
}
