

/*class Node
{
    int data;
    Node left,right;
    Node(int d)
    {
        data=d;
        left=right=null;
    }
}*/


class Tree
{
   
    int ans ;
    int countSubtreesWithSumX(Node root, int X)
    {
        ans = 0 ;
        help(root,X);
        return ans;
    }
    int  help(Node root,int target){
        if(root == null)return 0;
        int sum = 0 ;
        
        int lSum = help(root.left,target);
        int rSum = help(root.right,target);
         
          sum = root.data+lSum +rSum ;
          if(sum == target)ans++;
          
        return sum ;
    }
}

