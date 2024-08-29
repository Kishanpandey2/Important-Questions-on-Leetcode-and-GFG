
/*node class of the binary tree
class Node
{
    int data;
    Node left, right;
    Node(int key)
    {
        data = key;
        left = right = null;
    }
}*/
class Solution {
    // Function to construct binary tree from parent array.
    public Node createTree(int parent[]) {
        
         Map<Integer,Node>acces =new HashMap<>() ;
         
         for(int i = 0 ;i<parent.length;i++)
         {
             acces.put(i,new Node(i));
         }
        
        Node root = null;
        
        for(int i = 0 ;i<parent.length;i++)
        {
            if(parent[i]==-1)
            root = acces.get(i);
            else{
            Node par = acces.get(parent[i]);
            Node node = acces.get(i);
            
            if(par.left ==null)
            par.left = node;
            else if(par.right == null)
            par.right = node;
            }
        }
         
         return root;
    }
}
