
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

class GFG
{
   
	ArrayList<Integer> zigZagTraversal(Node root)
	{
	     Queue<Node>q = new LinkedList<>() ;
	     
	     q.add(root);
	     ArrayList<Integer>ans = new ArrayList<>() ;
	    
	     Stack<Integer>st = new Stack<>() ;
	     
	     boolean flag =true ;
	     while(!q.isEmpty()){
	         
	         int size = q.size() ;
	         
	         for(int i =  0 ;i<size;i++)
	         {
	             Node temp = q.poll() ;
	             
	             if(flag )
	             {
	                 ans.add(temp.data);
	             }
	             else
	             st.push(temp.data);
	             
	             if(temp.left != null)
	             q.add(temp.left);
	             
	             if(temp.right != null)
	             q.add(temp.right);
	         }
	         
	         while(!st.isEmpty())
	         ans.add(st.pop());
	         
	         flag  = !flag ;
	     }
	     
	     return ans;
	}
	
	
}
