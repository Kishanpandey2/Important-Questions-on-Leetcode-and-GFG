class Solution
{
    public static class TrieNode {
        TrieNode one,zero ;
    }
    public static void insert(TrieNode root ,int n){
        TrieNode cur = root ;
        for(int i = 31;i>=0;i--){
            int bit = (n>>i)&1 ;
            
            if(bit == 0 ){
                if(cur.zero == null){
                    TrieNode newNode = new TrieNode() ;
                     cur.zero = newNode;
                }
                cur = cur.zero ;
            }
            else
            {
                if(cur.one == null){
                    TrieNode newNode = new TrieNode() ;
                    cur.one = newNode;
                }
                cur = cur.one ;
            }
        }
    }
    
    public static int findMaxXor(TrieNode root ,int n){
        TrieNode cur = root ;
        int res = 0  ;
        
        for(int i = 31 ;i>=0 ;i--){
             int bit = (n>>i)&1 ;
             if(bit == 1){
                 if(cur.zero != null){
                     res += (1<<i) ;
                     cur = cur.zero  ;
                 }
                 else
                 cur = cur.one ;
                 
             }
             
             else
             {
                 if(cur.one != null){
                     res += (1<<i) ;
                     cur = cur.one  ;
                 }
                 else
                 cur = cur.zero ;
             }
        }
        return res ;
    }
    public static int max_xor(int arr[], int n)
    {
       TrieNode root = new TrieNode() ;
       int res = 0;
       
       for(int i = 0 ;i<n;i++){
           insert(root,arr[i]) ;
       }
       
       for(int i = 1 ;i<n;i++){
          res =  Math.max(res,findMaxXor(root,arr[i]));
       }
       return res;
    }
}
