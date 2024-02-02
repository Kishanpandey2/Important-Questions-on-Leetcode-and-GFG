
/*
  Merge two linked lists 
  head pointer input could be NULL as well for empty list
  Node is defined as 
    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
*/

class LinkedList
{
    
    Node sortedMerge(Node head1, Node head2) {
     if(head1 == null)return head2; 
     
     if(head2 ==null)return head1 ;
     
     Node tail = null, head = null ;
     
     if(head1.data<=head2.data)
     {
         head = head1 ;
         tail = head1 ;
         head1 = head1.next;
     }
     else
     {
          head = head2 ;
         tail = head2 ;
         head2 = head2.next;
     }
     
     while(head1!= null && head2!=null){
          if(head1.data<=head2.data)
     {
         tail.next = head1 ;
         tail = head1;
         head1 = head1.next;
     }
     else
     {
           tail.next = head2 ;
         tail = head2;
         head2 = head2.next;
     }
     
     }
     
     if(head1 == null)tail.next = head2 ;
     else
     tail.next = head1;
     
     return head;
   } 
}
