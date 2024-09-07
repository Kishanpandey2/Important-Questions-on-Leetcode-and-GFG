
class Solution{
   
    public static int findMiddle(Node head)
    {
       Node slow = head;
       Node fast = head;
       
       if(head.next == null)return head.data ;
       
       while(fast.next != head){
           slow = slow.next ;
           fast = fast.next.next;
       }
       return slow.data;
    }
};
