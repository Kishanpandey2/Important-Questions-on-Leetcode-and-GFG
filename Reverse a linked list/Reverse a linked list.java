// Method - 1

class Node {
    int data;
    Node next;
    Node(int value) {
        this.value = value;
    }
}


class Solution
{
    
    Node reverseList(Node head)
    {
          Node prev = null ;
          Node  cur = head;
            if(head == null || head.next == null)return head ;
          
          while(cur != null){
              Node next = cur.next; 
              cur.next = prev ;
              prev = cur ;
              cur = next;
          }
          
          return prev ;
    }
}


// method-2

class Solution
{
    
    Node reverseList(Node head)
    {
        
        return rev(head,null) ;
    }
    Node rev(Node cur, Node prev){
         if(cur == null)return prev ;
         Node next = cur.next ;
         cur.next = prev ;
         
         return rev(next,cur);
    }
}


// Method - 3


//function Template for Java

/* linked list node class:

class Node {
    int data;
    Node next;
    Node(int value) {
        this.value = value;
    }
}

*/

class Solution
{
    
    Node reverseList(Node head)
    {
          if(head == null || head.next == null)return head ;
        
          Node restHead = reverseList(head.next) ;
          Node restTail = head.next ;
          
          restTail.next = head ;
          head.next= null ;
          return restHead ;
    }
}
