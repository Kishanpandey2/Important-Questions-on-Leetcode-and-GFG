

class Queues
{
    Queue<Integer> q1 = new LinkedList<Integer>();
    Queue<Integer> q2 = new LinkedList<Integer>();
    
    
    void push(int a)
    {
	   while(!q1.isEmpty())
	    q2.offer(q1.poll()) ;
	    
	    q1.offer(a) ;
	    
	    while(!q2.isEmpty())
	    q1.offer(q2.poll()) ;
	    
    }
    
    
    int pop()
    {
        if(q1.isEmpty())return -1 ;
        
        return q1.poll() ;
        
    }
	
}

