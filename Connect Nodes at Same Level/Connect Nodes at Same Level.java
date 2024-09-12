
 /*
    Node class is Defined as follows:
    class Node{
        int data;
        Node left;
        Node right;
        Node nextRight;
        Node(int data){
            this.data = data;
            left=null;
            right=null;
            nextRight = null;
        }
    }
    */
    
class Solution
{
 
    public void connect(Node root)
    {
       Queue<Node> q = new LinkedList<>() ;
       Node prev = null ;
       Node end = root ;
       Node nextEnd = null;
       q.add(root);
     
       while(!q.isEmpty()){
           
           Node temp = q.poll() ;
           
           if(temp.left != null)
           {
               q.add(temp.left);
               nextEnd = temp.left;
           }
           
            if(temp.right != null)
           {
               q.add(temp.right);
               nextEnd = temp.right;
           }
           
           if(prev != null)
           prev.nextRight = temp ;
           
           if(temp == end)
           {
               temp.nextRight = null;
               prev = null;
               
               end = nextEnd;
           }
           else
           prev = temp;
       }
    }
}
