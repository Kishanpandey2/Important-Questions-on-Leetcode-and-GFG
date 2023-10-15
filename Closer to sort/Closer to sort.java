// Brute Force solution 

class Solution
{
  
    static long closer(int arr[], int n, long x)
    {
        int ind = -1  ;
        for(int i = 0 ;i<n;i++)
        if(arr[i] == x)
        ind = i ;
        
        return (long)ind ;
        
    }
}


// Efficient solution

class Solution
{
  
    static long closer(int arr[], int n, long x)
    {
        
        
        return binarySearch(arr,x) ;
        
    }
    static int binarySearch(int []arr,long x){
        int l = 0 , h = arr.length -1 ;
        
        while(l<=h){
            int m = l+(h-l)/2 ;
            
            if(arr[m] == x)
            return m ;
            else if(arr[m]>x){
                if(m+1<arr.length  && arr[m+1]== x)
                return m+1 ;
                else
                h = m-1 ;
            }
            else
            {
                 if(m-1>=0  && arr[m-1]== x)
                return m-1 ;
                else
                l = m+1 ;
            }
            
            
        }
        
        return -1;
    }
}
