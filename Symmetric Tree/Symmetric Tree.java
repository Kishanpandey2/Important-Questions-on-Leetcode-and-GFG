class GfG
{
    
    public static boolean isSymmetric(Node root)
    {
       return root==null || helpFunction(root.left ,root.right) ;
    }
    static boolean helpFunction(Node left , Node right) 
    {
        if(left == null || right == null)
        return left == right ;

        if(left.data != right.data)
        return false ;

        return helpFunction(left.left,right.right) &&  helpFunction(left.right,right.left) ;
    }
}
