class Node
{
    int data;
    Node left;
    Node right;

        Node(int value)
    {
        data = value;
        left = null;
        right = null;
    }
}*/

class GfG {
    Map<Integer,Integer>hm ;
    Node buildTree(int n, int in[], int post[]) {
        hm = new HashMap<>() ;
        
        for(int i = 0 ;i<in.length;i++)
        hm.put(in[i],i);
        
         return help(in,0,in.length-1,post,0,post.length-1);
    }
    Node help(int []in,int is,int ie,int []post,int ps,int pe){
        if(is > ie || ps > pe)return null;
        
        Node root = new Node(post[pe]);
        
        int inRoot  = hm.get(post[pe]);
       int leftSub = inRoot-is;
       
       root.left =  help(in ,is,inRoot-1,post,ps,ps+leftSub-1);
       root.right =  help(in ,inRoot+1,ie,post,ps+leftSub,pe-1);
       return root;
        
    }
}
