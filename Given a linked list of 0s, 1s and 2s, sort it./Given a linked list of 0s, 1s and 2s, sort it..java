/*
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}
*/
class Solution
{
    //Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head)
    {
        int []freq = new int[3];
        
        Node cur = head;
        while(cur != null)
        {
            if(cur.data == 0)
            freq[0]++ ;
            else if(cur.data==1)
            freq[1]++;
            else
            freq[2]++;
            
            cur = cur.next;
        }
        
        cur = head ;
        
        while(freq[0]>0)
        {
            cur.data = 0 ;
            freq[0]--;
            cur = cur.next ;
        }
         while(freq[1]>0)
        {
            cur.data = 1 ;
            freq[1]--;
            cur = cur.next ;
        }
         while(freq[2]>0)
        {
            cur.data = 2 ;
            freq[2]--;
            cur = cur.next ;
        }
        
        return head;
        
    }
}


