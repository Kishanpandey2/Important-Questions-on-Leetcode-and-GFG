
/*
class Node
{
    int data;
    Node next, prev;
    Node(int data)
    {
        this.data = data;
        next = prev = null;
    }
}
*/
class LinkedList
{
     static Node merge(Node a,Node b){
        if(a == null)return b;
        if(b == null)return a;
        
        Node head = null , tail = null;
        
        if(a.data <= b.data)
        {
            head = a ; tail = a; a = a.next ;
        }
        else
        {
             head = b ; tail = b; b = b.next ;
        }
        
        while(a!= null && b!= null)
        {
            if(a.data<=b.data)
            {
                tail.next = a ;
                a.prev = tail;
                tail = a ; a = a.next ;
            }
            else
            {
                  tail.next = b ;
                  b.prev = tail;
                tail = b ; b = b.next ;
            }
        }
        
        if(a == null){tail.next = b ;
            b.prev = tail;
        }
        else
        {tail.next  = a;
            a.prev = tail;
        }
        
        return head;
        
        
       
    }
    static Node sortDoubly(Node head)
    {
        if(head == null || head.next == null)return head;
        Node prev = null;
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = null;
        slow.prev = null;
        Node head1 = sortDoubly(head);
        Node head2 = sortDoubly(slow);
        Node ans = merge(head1,head2);
        return ans;
    }
}
