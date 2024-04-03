
class Solution
{
   
    static ArrayList <Integer> max_of_subarrays(int arr[], int n, int k)
    {
        ArrayList<Integer>ans = new ArrayList<>();
        Deque<Integer>d = new ArrayDeque<>() ;
        
        for(int i = 0 ;i<k;i++)
        {
            while(!d.isEmpty() && arr[i]>= arr[d.peekLast()])
            d.removeLast();
            
            d.addLast(i);
        }
        
        for(int i =k;i<n;i++)
        {
            ans.add(arr[d.peekFirst()]);
            while(!d.isEmpty() && d.peekFirst()<= i-k)d.removeFirst();
            
             while(!d.isEmpty() && arr[i]>= arr[d.peekLast()])
            d.removeLast();
            
            d.addLast(i);
        }
        ans.add(arr[d.peekFirst()]);
        
        return ans;
    }
}
