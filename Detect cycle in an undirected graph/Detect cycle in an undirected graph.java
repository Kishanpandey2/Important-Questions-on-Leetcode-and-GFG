class Solution {
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        boolean []visited = new boolean[V] ;
        for(int i = 0 ;i<V;i++)
        {
            if(!visited[i])
            {
                if(dfs(i,adj,visited,-1))
                return true ;
            }
        }
        return false ;
    }
    private boolean dfs(int v,ArrayList<ArrayList<Integer>> adj , boolean []vis , int prnt )
    {
        vis[v]= true ;
        for(Integer neighbour : adj.get(v))
        {
            if(!vis[neighbour])
            {
                if(dfs(neighbour,adj,vis,v))
                return true;
            }
            else if(prnt != neighbour)
            return true;
        }
        return false;
    }
}
