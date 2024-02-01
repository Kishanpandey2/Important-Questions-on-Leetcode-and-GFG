
/* The structure of linked list is the following
class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d; 
        next = null;
    }
}
*/

class Solution
{
   
    public Node removeDuplicates(Node head) 
    {
      
       int []vis = new int[10001] ;
       
       Node prev =null  ;
       
       Node cur = head;
        
       while(cur != null )
       {
           if(vis[cur.data]==1)
          {
              prev.next = cur.next ;
             
          }
           else
           {
               prev =cur;
               vis[cur.data] = 1;
               
           }
           cur = cur.next;
       }
       return head;
    }
}
