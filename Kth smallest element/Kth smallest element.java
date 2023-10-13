//  method 1
class Solution
{
    
    public static int kthSmallest(int arr[], int n, int k)
    {
        PriorityQueue<Integer>pq = new PriorityQueue<>()  ;
        
        for(int i : arr)
        pq.add(i) ;
        
        n = k-1;
        while(n-- >0)
        pq.poll() ;
        
        return pq.peek();
        
    }
    }
   
      

// Method 2

class Solution
{
    
    public static int kthSmallest(int arr[], int n, int k)
    {
        
        Arrays.sort(arr) ;
        return arr[k-1] ;
     
        
    }
}



// Method 3


class Solution
{
    
    public static int kthSmallest(int arr[], int n, int k)
  {
    
        int l = 0 , h = n-1 ;
        while(l<= h){
            int p = partition(arr,l,h) ;
            if(p == k-1)
            return arr[p] ;
            else if(p>k-1)
            h = p-1 ;
            else
            l = p+1 ;
        }
        
        return -1;
     
        
    }
    public static int partition(int []arr, int l ,int h){
        int pivot = arr[h] ;
        int i = l - 1;
        for(int j = l ;j<=h-1;j++){
            if(arr[j]<pivot)
            {
                i++ ;
                int t = arr[i] ;
                arr[i] = arr[j] ;
                arr[j] = t ;
            }
        }
         int t = arr[i+1] ;
                arr[i+1] = arr[h] ;
                arr[h] = t ;
                
                return i+1 ;
    }
}
