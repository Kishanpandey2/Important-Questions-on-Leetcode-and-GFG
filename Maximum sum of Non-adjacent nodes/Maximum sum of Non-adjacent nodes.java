/*class Node
{
    int data;
    Node left, right;
    
    Node(int data)
    {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}*/

class Solution
{
   
    static int getMaxSum(Node root)
    {
        Map<Node,Integer>map = new HashMap<>();
         return help(root,map);
    }
    static int help(Node root, Map<Node ,Integer>map ){
        if(root == null)return 0 ;
        
        if(map.containsKey(root))return map.get(root);
        
        int include = 0, exclude = 0;
        
        include += root.data;
        
        if(root.left != null)
        {
            include += help(root.left.left,map);
            include += help(root.left.right,map);
        }
          if(root.right != null)
        {
            include += help(root.right.left,map);
            include += help(root.right.right,map);
        }
        
        exclude += help(root.left,map);
        exclude += help(root.right,map);
        map.put(root,Math.max(include,exclude) );
        return map.get(root);
        
    }
}
