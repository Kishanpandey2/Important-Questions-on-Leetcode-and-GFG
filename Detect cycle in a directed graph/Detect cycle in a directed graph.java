
class Solution {
    
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
     
        boolean visited[] = new boolean[V] ;
        boolean recursiveStack[] = new boolean[V] ;
        for(int i = 0 ;i<V;i++)
        {
            if(!visited[i])
            {
                if(dfs(i,adj,visited, recursiveStack))
                return true ;
            }
        }
        return false ;
    }
    public boolean dfs(int v ,ArrayList<ArrayList<Integer>> adj , boolean []vis, boolean []recursiveStack)
    {
        vis[v]= true ;
        recursiveStack[v]= true ;
        for(Integer neighbour : adj.get(v))
        {
            if(!vis[neighbour])
            {
                if(dfs(neighbour, adj,vis, recursiveStack))
                return true ;
            }
            else if(recursiveStack[neighbour])
            return true ;
        }
        recursiveStack[v]=  false ;
        return false ;
    }
}



Expected Time Complexity: O(V + E)
Expected Auxiliary Space: O(V)
