// Method -  1
/*
// A Binary Tree node
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/

class Spiral
{
    //Function to return a list containing the level order 
    //traversal in spiral form.	
    ArrayList<Integer> findSpiral(Node root) 
    {
         ArrayList<Integer>ans = new ArrayList<>() ;
         Stack<Node>st1 = new Stack<>() ;
         Stack<Node>st2 = new Stack<>() ;
          
          st1.add(root);
         
         while(!st1.isEmpty() || !st2.isEmpty()){
            
            while(!st1.isEmpty())
            {
                Node temp = st1.pop() ;
                
                ans.add(temp.data);
                
                if(temp.right!=null)
                st2.add(temp.right);
                
                if(temp.left!=null)
                st2.add(temp.left);
            }
            
              while(!st2.isEmpty())
            {
                Node temp = st2.pop() ;
                    ans.add(temp.data);
                    
                
                if(temp.left!=null)
                st1.add(temp.left);
                if(temp.right!=null)
                st1.add(temp.right);
            }
         }
         
         return ans;
    }
}






// Method - 2

class Spiral
{
    //Function to return a list containing the level order 
    //traversal in spiral form.	
    ArrayList<Integer> findSpiral(Node root) 
    {
         ArrayList<Integer>ans = new ArrayList<>() ;
         Stack<Integer>st = new Stack<>() ;
         
         Queue<Node>q = new LinkedList<>() ;
         q.add(root);
         
         boolean flag = true;
         while(!q.isEmpty()){
             int size = q.size() ;
             for(int i = 0 ;i<size;i++){
                 Node temp = q.poll() ;
                 
                 if(flag){
                     st.push(temp.data) ;
                 }
                 else
                 ans.add(temp.data);
                 
                 if(temp.left != null){
                     q.add(temp.left);
                 }
                 
                 if(temp.right!=null){
                     q.add(temp.right);
                     
                 }
                 
             }
             
             while(!st.isEmpty())
             ans.add(st.pop());
             
             flag = !flag ;
         }
         
         return ans;
    }
}
