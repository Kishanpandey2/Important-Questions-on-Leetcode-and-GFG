// Method - 1

/* Structure of class Node is
class Node
{
	int data;
	Node next;
	
	Node(int d)
	{
		data = d;
		next = null;
	}
}*/

class Solution
{
   
    boolean isPalindrome(Node head) 
    {
       
        
        Deque<Integer > st = new ArrayDeque<>() ;
        
         for(Node cur = head;cur!= null ; cur  = cur.next)
         st.push(cur.data) ;
         
         for(Node cur = head ;cur != null ;cur  = cur.next)
         if(st.pop() != cur.data)return false;
         
         return true;
    }    
}



// Method - 2
/* Structure of class Node is
class Node
{
	int data;
	Node next;
	
	Node(int d)
	{
		data = d;
		next = null;
	}
}*/

class Solution
{
   
    boolean isPalindrome(Node head) 
    {
       
        Node slow = head , fast = head ;
        
        while(fast.next != null && fast.next.next != null)
        {
            slow = slow.next ;
            fast = fast.next.next ;
            
        }
        
        Node rev = reverse(slow.next) ;
        
        Node cur = head ;
        while(rev!= null)
        {
            if(cur.data!= rev.data)return false;
            rev = rev.next ;
            cur = cur.next ;
        }
        
        return true ;
    }    
    
    Node reverse(Node root)
    {
        
        Node prev  = null , cur = root , next = null ;
        
        
        while(cur != null)
        {
            next = cur.next ;
            cur.next = prev ;
            prev = cur ;
            cur = next ;
        }
        return prev ;
    }
}



