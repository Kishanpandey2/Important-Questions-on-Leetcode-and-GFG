public static void eraseAt(ArrayDeque<Integer> deq , int x)
{
    
    int size = deq.size();
    for(int i = 0;i<size;i++)
    {
        if(i == x)deq.poll();
        else
        deq.addLast(deq.pollFirst()) ;
        
    }
}

//Function to erase the elements in range start (inclusive), end (exclusive).
public static void eraseInRange(ArrayDeque<Integer> deq , int start, int end)
{
    int cnt = 0 ;
    for(Integer i: deq)
    {
        if(cnt>=start && cnt<end)
        deq.remove(i);
        
        //cnt++;
    }
    
}

//Function to erase all the elements in the deque.
public static void eraseAll(ArrayDeque<Integer> deq )
{
    while(!deq.isEmpty())
    deq.poll();
    
}
