
class Solution {
    int min = Integer.MAX_VALUE;
    int max  = Integer.MIN_VALUE;
    public int verticalWidth(Node root) {
        if(root == null)return 0;
        
        help(root,0);
        
        return Math.abs(min)+max+1;
    }
    
    void help(Node root, int mxWidth){
        if(root == null)return ;
        max = Math.max(max,mxWidth);
        min = Math.min(min,mxWidth);
        help(root.left,mxWidth-1);
        help(root.right,mxWidth+1);
    }
}
