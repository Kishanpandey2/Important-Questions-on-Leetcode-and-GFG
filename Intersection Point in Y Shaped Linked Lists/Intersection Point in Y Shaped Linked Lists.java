// Method - 1

/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
 Linked List class
class LinkedList
{
    Node head;  // head of list
}*/

class Intersect
{
    
	int intersectPoint(Node head1, Node head2)
	{
        Set<Node >st = new HashSet<>() ;
        
        for(Node cur = head1 ;cur != null ;cur = cur.next)
        st.add(cur) ;
        
        for(Node cur = head2;cur != null ;cur = cur.next )
        if(st.contains(cur))return cur.data ;
        
        return -1;
	}
}




// Method - 2 

/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
 Linked List class
class LinkedList
{
    Node head;  // head of list
}*/

class Intersect
{
    
	int intersectPoint(Node head1, Node head2)
	{
        int len1 = 0 , len2= 0 ;
        
        
        for(Node cur = head1 ;cur != null ;cur = cur.next)
        len1++ ;
        
        for(Node cur = head2;cur != null ;cur = cur.next )
        len2++;
        
        if(len1>=len2)
        {
            int cnt = 0 ;
           while(head1 != null && cnt < Math.abs(len1-len2))
           {head1 = head1.next ;
               cnt++;
           }
        }
        else
        {
            int cnt = 0 ;
           while(head2 != null && cnt < Math.abs(len1-len2))
           {head2 = head2.next ;
               cnt++;
           }
        }
        
        while(head1 != null && head2 != null)
        {if(head1 == head2)return head1.data;
            head1 = head1.next ;
            head2 = head2.next ;
        }
        
        return -1;
	}
}



