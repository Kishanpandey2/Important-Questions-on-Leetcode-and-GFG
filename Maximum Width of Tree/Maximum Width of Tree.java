
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
} */

class Solution {
    // Function to get the maximum width of a binary tree.
    int getMaxWidth(Node root) {
        int ans = 0 ;
        Queue<Node>q = new LinkedList<>() ;
        
        q.add(root);
        
        while(!q.isEmpty()){
            int size= q.size() ;
            
            ans = Math.max(ans,size) ;
            
            for(int i = 0 ;i<size;i++){
                Node temp = q.poll() ;
                
                if(temp.left != null)
                q.add(temp.left) ;
                
                if(temp.right != null)
                {
                    q.add(temp.right) ;
                    
                }
                
                
            }
        }
        
        return ans;
    }
}
