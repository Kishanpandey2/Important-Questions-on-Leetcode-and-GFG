class Solution {
    public Node deleteNode(Node head, int x) {
        if(x == 1)return head.next;
        Node prev = null ;
        int pos = 1;
        Node cur =head;
        
        while(cur != null )
        {
            if(pos == x)break;
            prev = cur ;
            cur = cur.next;
            pos++;
        }
        
        if(cur.next == null)
        prev.next = null;
        else
        {
        prev.next = cur.next;
        cur.next.prev = prev;
        }
        
        return head;
    }
}
