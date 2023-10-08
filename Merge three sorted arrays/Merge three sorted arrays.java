
class Solution
{
    static ArrayList<Integer> merge3sorted(int A[], int B[], int C[])
    {
        ArrayList<Integer>ans = new ArrayList<>() ;
        PriorityQueue<Integer>pq = new PriorityQueue<>() ;
        
        for(int i : A)pq.add(i) ;
        for(int i : B)pq.add(i) ;
        for(int i : C)pq.add(i) ;
        
        
        while(!pq.isEmpty())
        ans.add(pq.poll()) ;
        
        return ans;
    }
}
