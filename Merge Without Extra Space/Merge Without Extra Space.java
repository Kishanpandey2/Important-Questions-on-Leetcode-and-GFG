// Using Extra space 

class Solution
{
    public static void merge(long arr1[], long arr2[], int n, int m) 
    {
        PriorityQueue<Long>pq = new PriorityQueue<>() ;
        for(long l : arr1)pq.add(l) ;
        for(long l : arr2)pq.add(l) ;
        
       
        for(int i = 0 ;i<n;i++)
        arr1[i] = pq.poll() ;
          for(int i = 0 ;i<m;i++)
        arr2[i] = pq.poll() ;
    }
}


// Without using extra space ;

class Solution
{
     
    public static void merge(long arr1[], long arr2[], int n, int m) 
    {
       int i = n-1, j = 0 ;
       
       while(i>=0 && j<m){
           if(arr1[i]<=arr2[j])break ;
           else
           {
               long temp = arr1[i] ;
               arr1[i] = arr2[j] ;
               arr2[j] = temp ;
               i-- ; j++ ;
           }
       }
       Arrays.sort(arr1) ;
       Arrays.sort(arr2) ;
    }
}
