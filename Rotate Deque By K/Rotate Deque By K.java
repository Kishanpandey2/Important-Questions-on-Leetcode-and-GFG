public static void left_Rotate_Deq_ByK(ArrayDeque<Integer> d, int n, int k)
{
     int size = d.size() ;
    
    for(int i = 0;i<size - k;i++)
    d.addFirst(d.removeLast());
}

//Function to rotate deque by k places in clockwise direction.
public static void right_Rotate_Deq_ByK(ArrayDeque<Integer> d, int n, int k)
{
    int size = d.size() ;
   
    for(int i = 0;i<size - k;i++)
    d.addLast(d.removeFirst());
}
