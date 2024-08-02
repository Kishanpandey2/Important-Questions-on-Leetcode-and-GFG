// Iterative solution using level order traversal

/* A Binary Tree node
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}*/
class Tree
{
  
    ArrayList<Integer> leftView(Node root)
    {
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
                if(i == 0 )
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









// Recursive solution

class Tree
{
   
    ArrayList<Integer> leftView(Node root)
    { 
        ArrayList<Integer>ans = new ArrayList<Integer>() ;
        help(root,ans,1);
        return ans;
    }
    int mxLevel = 0 ;
    void help(Node root,ArrayList<Integer> ans,int level){
        if(root == null)return ;
        
        if(mxLevel<level)
        {
            ans.add(root.data);
            mxLevel = level ;
        }
        
        help(root.left,ans,level+1);
        help(root.right,ans,level+1);
        
        
    }
}
