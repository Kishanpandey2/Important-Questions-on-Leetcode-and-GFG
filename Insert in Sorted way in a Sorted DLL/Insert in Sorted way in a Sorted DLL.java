/*
class Node {
    int data;
    Node prev, next;
    Node(int data) {
        this.data = data;
        this.prev = this.next = null;
    }
}
*/
class Solution {
    public Node sortedInsert(Node head, int x) {
        if(x <= head.data)
        {
            Node temp = new Node(x);
            temp.next= head;
            return temp;
        }
        
        Node temp = new Node(x);
        Node prev = null; 
        Node cur  = head;
        boolean flag = false;
        
        while(cur != null){
            if(cur.data >= x)
            {
                temp.next = cur ;
                prev.next = temp ;
                flag = true;
               break;
                
            }
            
            prev = cur ;
            cur = cur.next;
        }
        if(flag == false && prev.data < x)
        prev.next = temp;
    

        return head;
    }
}
