// Brute Force solution

/*class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}*/

class Solution {
    int diameter(Node root) {
        // Your code here
        
        if(root == null)return 0 ;
        
        int d1 = height(root.left)+height(root.right)+1 ;
        int d2  = diameter(root.left);
        int d3 = diameter(root.right);
        
        return Math.max(d1,Math.max(d2,d3));
        
    }
    int height(Node root){
        if(root == null)return 0 ;
        return Math.max(height(root.left),height(root.right))+1 ;
    }
}




// Efficient solution 

class Solution {
   
    int ans = 0 ;
    int diameter(Node root) {
         height(root);
         
         return ans;
    }
    int height(Node root){
        if(root == null)return 0 ;
        
        int lh = height(root.left);
        int rh = height(root.right);
        
        ans = Math.max(ans,1+lh+rh);
        
        return 1+Math.max(lh,rh);
        
    }
}

