
/*
class Node
{
    int data;
    Node left, right;
    
    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/

class Tree
{ 
    int ans = Integer.MIN_VALUE ;
    int maxDiff(Node root)
    {
      help(root);
      return ans;
    }
    int help(Node root){
         if(root == null)return Integer.MAX_VALUE ;
  
         int  lMin = help(root.left);
         int rMin = help(root.right);
         
        
         ans= Math.max(ans, Math.max(root.data - lMin, root.data-rMin) ) ;
         
         return Math.min(lMin, Math.min(root.data,rMin));
    }
}

