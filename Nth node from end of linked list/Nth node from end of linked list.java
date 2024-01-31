// Method -1 using length of the linkedList

/* Structure of node

class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}
*/

class Solution
{
   
    int getNthFromLast(Node head, int n)
    {
       int len = 0 ;
       
       Node cur = head ;
       while(cur != null)
       {
           len++ ;
           cur = cur.next ;
       }
       
       if(n>len)return -1;
       
       cur  = head ;
       for(int i = 0;i<len-n;i++)
       cur = cur.next ;
       
       return cur.data;
       
    }
}




// Method - 2 using two references


/* Structure of node

class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}
*/

class Solution
{
    
    int getNthFromLast(Node head, int n)
    {
    Node first = head ;
    
    for(int i =0;i<n;i++)
    {
        if(first == null)return -1;
        first = first.next; 
    }
    
    Node second  = head;
        
        while(first!= null)
        {
            second = second.next ;
            first = first.next;
        }
        
        return second.data;
    
    }
}
