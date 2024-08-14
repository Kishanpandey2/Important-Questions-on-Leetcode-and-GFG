
/* class Node{
    int data;
    Node left,right;
    Node(int d)
    {
        data=d;
        left=null;
        right=null;
    }
}*/

class Solution {
    public static boolean isSubtree(Node T, Node S) {
      String fullTree = preOrder(T);
      String sbTree = preOrder(S);
      
      return fullTree.contains(sbTree);
    }
   static String preOrder(Node root){
        if(root == null)return "null";
        
        StringBuilder sb = new StringBuilder(",") ;
        
        sb.append(root.data);
        sb.append(preOrder(root.left));
        sb.append(preOrder(root.right));
        
        return sb.toString() ;
    }
}
