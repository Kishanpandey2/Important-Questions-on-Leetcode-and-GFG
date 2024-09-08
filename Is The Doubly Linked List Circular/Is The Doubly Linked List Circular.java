
/*class Node
{
    int data;
    Node next, prev;
    Node(int data)
    {
        this.data = data;
        this.next = this.prev = null;
    }
}*/

class Solution{
    public static boolean isCircular(Node head)
    {
         Node slow= head;
         Node fast =head;
         
         while(fast != null && fast.next != null)
         {
             slow = slow.next;
             fast = fast.next.next;
             
             if(slow == fast)return true;
         }
         
         return false;
    }
};
