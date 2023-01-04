class Solution {
   
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
       
        ArrayList<Integer>res = new ArrayList<>() ;
        boolean []visited = new boolean[V] ;
        dfs(0,adj,visited,res) ;
        return res ;
    }
    public void dfs(int v , ArrayList<ArrayList<Integer>> adj, boolean []vis , ArrayList<Integer> res)
    {
        vis[v ]= true ;
        res.add(v)  ;
        for(Integer neighbour : adj.get(v)) 
        {
            if(!vis[neighbour])
            dfs(neighbour ,  adj, vis,res) ;
        }
    }
}

Expected Time Complexity: O(V + E)
Expected Auxiliary Space: O(V)
