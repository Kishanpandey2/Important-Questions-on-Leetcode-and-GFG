/* Structure of Doubly Linked List
class Node
{
	int data;
	Node next;
	Node prev;
	Node(int data)
	{
	    this.data = data;
	    next = prev = null;
	}
}*/

class GfG
{
    void addNode(Node head_ref, int pos, int data)
	{
	    Node temp = new Node(data) ;
	  
	    Node cur = head_ref ;
	    for(int i = 1 ;i<=pos;i++)
	    {
	        cur = cur.next ;
	    }
	    
	        
	    temp.prev = cur ;
	    temp.next = cur.next; 
	    cur.next = temp ;
	  
	    
	}
}
