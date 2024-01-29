/* node for linked list

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

*/

class Solution{
    
    static Node addTwoLists(Node first, Node second){
        Node fNode = rev(first);
        Node sNode = rev(second) ;
        
        int carry = 0 ;
        Node res = null ;
        
        while(fNode != null || sNode != null || carry>0){
            int val = carry ;
            
            if(fNode != null) {val += fNode.data ; fNode = fNode.next ; }
            if(sNode != null) {val += sNode.data ; sNode = sNode.next ; }
            
            Node node = new Node(val%10) ;
            carry = val/10;
            node.next = res;
            res = node ;
        }
        return res;
    }
    
    static Node rev(Node head){
        if(head == null || head.next == null)return head ;
        
        Node next = null, cur = head, prev = null;
        
        while(cur!= null){
            next  = cur.next ;
            cur.next = prev;
            prev = cur ;
            cur = next ;
        }
        return prev;
    }
}
