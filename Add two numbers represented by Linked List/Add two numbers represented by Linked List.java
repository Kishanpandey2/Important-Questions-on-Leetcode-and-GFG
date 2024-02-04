
 
/*class Node 
{
    int data;
    Node next;
    
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}*/
class GfG {

    Node cur; // Dont change the variable name, its used in main function
    int carry; // Dont change the variable name, its used in main function
    int sum ;
    //This function is called after the smaller list is added to the sublist of 
    //bigger list of same size. Once the right sublist is added, the carry
    //must be added to left side of larger list to get the final result. 
    
    void addCarryToRemaining(Node head, LinkedList res)  { 
           if(head != cur )
        {
            addCarryToRemaining(head.next,res);
            sum = (head.data + carry)%10;
            carry = (head.data + carry)/10;
            res.push(sum);
        }
    } 
    
    //Function which adds two linked lists of same size represented by head1  
    //and head2 and returns head of the resultant linked list. Carry
    //is propagated while returning from the recursion    
    
	void addSameSize(Node head1, Node head2, LinkedList res) { 
	    
	    Node h1= reverse(head1);
	    Node h2= reverse(head2);
	    
	     Node curr1 = h1;
    Node curr2 = h2;

	    
	     while(curr1 != null && curr2 != null){
        sum = (curr1.data + curr2.data + carry)%10;
        carry = (curr1.data + curr2.data + carry)/10;
        res.push(sum);
        curr1 = curr1.next;
        curr2 = curr2.next;
    }
	    
    }
    Node reverse(Node head){
        Node next = null , prev = null ;
        Node temp = head;
        while(temp != null){
            next  = temp.next ;
            temp.next = prev ;
            
            prev = temp ;
            temp  = next ;
        }
        
        return prev ;
    }
} 
