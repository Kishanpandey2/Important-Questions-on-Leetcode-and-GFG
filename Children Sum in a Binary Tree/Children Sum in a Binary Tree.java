class Solution
{
     
    public static int isSumProperty(Node root)
    {
       if(help(root))return 1 ;
       
       return 0; 
    }
   static boolean help(Node root){
        if(root == null)return true ;
        if(root.left == null && root.right==null)return true ;
        
        int sum = 0 ;
        if(root.left != null)
        sum += root.left.data ;
        
                if(root.right != null)
        sum += root.right.data ;
       
        
        return (root.data == sum ) && help(root.left) && help(root.right);
    }
}
