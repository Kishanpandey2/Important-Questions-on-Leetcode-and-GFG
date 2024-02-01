/*
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        this.data = key;
        next = null;
    }
} */

class Solution
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
                tail = a ; a = a.next ;
            }
            else
            {
                  tail.next = b ;
                tail = b ; b = b.next ;
            }
        }
        
        if(a == null)tail.next = b ;
        else
        tail.next  = a;
        
        return head;
        
        
       
    }
    static Node mergeSort(Node head)
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
        Node head1 = mergeSort(head);
        Node head2 = mergeSort(slow);
        Node ans = merge(head1,head2);
        return ans;
    }
}

