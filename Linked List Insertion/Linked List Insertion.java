
/*
class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
}
*/
class Solution
{
   
    Node insertAtBeginning(Node head, int x)
    {
    Node temp  = new Node(x) ;
    
       temp.next = head ;
       return temp ;
    }
    
    Node insertAtEnd(Node head, int x)
    {
        Node temp = new Node(x) ;
        
        if(head == null)return temp ;
        
        Node cur = head ;
        
        while(cur.next != null)cur = cur.next ;
        
        cur.next = temp ;
        return head ;
        
    }
}
