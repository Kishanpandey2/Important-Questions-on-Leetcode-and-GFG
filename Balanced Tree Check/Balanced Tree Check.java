// Method -1

/* A binary tree node class
class Node
{
	int data;
	Node left,right;
	
	Node(int d)
	{
		data = d;
		left = right = null;		
	}
} */

class Tree
{
    
    
    boolean isBalanced(Node root)
    { 
        int ans = height(root) ;
        
        return ans != -1;
    }
    
    int height(Node root){
     if(root == null)return 0 ;
     
     int lh = height(root.left);
     if(lh == -1)return -1 ;
     int rh = height(root.right);
     if(rh == -1)return -1;
     
     if(Math.abs(lh-rh)>1)return -1;
     else
     return 1+Math.max(lh,rh);
     
    }
}




// Method -2

class Tree
{
    
    //Function to check whether a binary tree is balanced or not.
    boolean isBalanced(Node root)
    {
	        if(root==null) return true;
	        
	        int l = height(root.left);
	        int r = height(root.right);
	        
	        return( Math.abs(l-r)<=1 && isBalanced(root.left) && isBalanced(root.right));
    }
    
    int height(Node root){
        if(root==null)return 0 ;
        else
        return 1+(Math.max(height(root.left),height(root.right)));
    }
}

