
/*
class Node
{
	int data ;
	Node next;
	Node(int d)
	{
		data = d;
		next = null;
	}
}
*/

//Function to delete a node without any reference to head pointer.
class Solution
{
    void deleteNode(Node del)
    {
         int temp = del.data ;
         del.data = del.next.data; 
         del.next.data = temp ;
         del.next = del.next.next;
         
    }
}

