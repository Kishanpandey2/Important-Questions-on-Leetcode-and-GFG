
class Solution {
    static void dfs(ArrayList<ArrayList<Integer>> adj, int i, boolean []vis){
        for(int j = 0 ;j<adj.size() ;j++){
            if(i!=j && adj.get(i).get(j)==1 && vis[j] == false){
                vis[j] = true ;
                dfs(adj,j,vis) ;
            }
        }
    }
    static int numProvinces(ArrayList<ArrayList<Integer>> adj, int V) {
        int n = adj.size() ;
        boolean []vis = new boolean[n] ;
        int cnt = 0  ;
        for(int i = 0 ;i<n;i++){
            if(vis[i] == false )
            {
                cnt++ ;
                dfs(adj,i,vis);
            }
        }
        return cnt ;
    }
};
