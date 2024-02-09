/* node of linked list:

class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}

*/

class Solution{
    //Function to rotate a linked list.
    public Node rotate(Node head, int k) {
       Node cur = head ;
       while(cur.next != null)cur =cur.next ;
       
       cur.next = head ;
       
       Node prev = head ;
       
       for(int i = 0 ;i<k;i++)
       {
           prev = head ;
           head = head.next; 
       }
       prev.next = null ;
       
       return head;
    }
}
