
/*
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}
*/

class Solution
{
    public static boolean isSorted(Node head)
    {
        if(head.next == null)return true;
        
        int len = 0 ;
        Node temp =head;
        while(temp != null )
        {
            len++; temp = temp.next;
        }
        
         
        Node t1 = head;
        Node t2 = head;
        
        Node prev = head;
        Node cur = head.next;
        int cnt1 = 1 ,cnt2 = 1;
         
        
        while(cur != null){
            int prevData = prev.data;
            int curData = cur.data;
            
            if(prevData <= curData)
            {
                t1.next = new Node(curData);
                t1 = t1.next;
                cnt1++;
            }
              if(prevData >= curData)
            {
                t2.next = new Node(curData);
                t2 = t2.next;
                 cnt2++;
            }
            
            
            
            prev  = cur;
            cur = cur.next;
            
        }
        
        return (cnt1 == len || cnt2==len);
    }
}
