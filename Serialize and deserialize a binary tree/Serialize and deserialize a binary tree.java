
/*Complete the given function
Node is as follows:
class Tree{
    int data;
    Tree left,right;
    Tree(int d){
        data=d;
        left=right=null;
    }
}*/

class Tree {
   
    public ArrayList<Integer> serialize(Node root) {
       ArrayList<Integer> ans = new ArrayList<>() ;
       helpSerialize(root,ans);
       
      
       return ans;
    }
  void   helpSerialize(Node root, ArrayList<Integer> ans){
        if(root == null)
        {
         ans.add(-1);   
         return ;
        }
        
        ans.add(root.data);
        helpSerialize(root.left,ans);
        helpSerialize(root.right,ans);
    }
    // Function to deserialize a list and construct the tree.
    public Node deSerialize(ArrayList<Integer> A) {
       return  helpDeSerialize(A);
        
    }
    int ind = 0 ;
   Node helpDeSerialize(ArrayList<Integer> A){
        if(ind == A.size() )
        return null;
        
        int val = A.get(ind);
        ind++;
        if(val == -1)return null;
        
        Node root = new Node(val);
        root.left = helpDeSerialize(A);
        root.right =  helpDeSerialize(A);
        return root;
    }
};
