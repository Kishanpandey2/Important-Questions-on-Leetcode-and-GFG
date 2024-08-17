
/*
node class of the binary tree
class Node
{
    int data;
    Node left, right;
    Node(int key)
    {
        data = key;
        left = right = null;
    }
}
*/
class Tree
{
     
    boolean IsFoldable(Node node) 
	{ 
	    if(node == null)return true ;
	    
	    return help(node.left,node.right);
	    
	}
	boolean help(Node left ,Node right){
	        if(left == null && right == null)return true ;
	        
	        if(left == null || right == null)return false;
	        
	        return help(left.right,right.left)&&help(left.left,right.right);
	}
}
