// Recursive

class Solution {
   
    ArrayList<Integer> rightView(Node root) {
        ArrayList<Integer>ans = new ArrayList<Integer>() ;
       
        help(root,ans,1);
        
        return ans;
    }
    
    int mxLevel = 0 ;
    void help(Node root,ArrayList<Integer> ans,int level){
        if(root == null)
        return  ;
        
        if(mxLevel<level)
        {
            ans.add(root.data) ;
            mxLevel = level;
        }
        help(root.right,ans,level+1);
        help(root.left,ans,level+1) ;
        
        
    }
}














// Iterative

class Solution {
    // Function to return list containing elements of right view of binary tree.
    ArrayList<Integer> rightView(Node root) {
         if(root == null)return new ArrayList<>();
     Queue<Node>q = new LinkedList<>() ;
      ArrayList<Integer> ans = new ArrayList<>() ;
      
      
        q.add(root);
        
        while(!q.isEmpty())
        {
            int size =q.size() ;
            
            for(int i = 0 ;i<size;i++)
            {
                Node temp  = q.poll();
                if(i == size-1 )
                ans.add(temp.data);
                
                
                if(temp.left != null)
                q.add(temp.left);
                
                    if(temp.right != null)
                q.add(temp.right);
            }
        }
        
        return ans;
    }
}
