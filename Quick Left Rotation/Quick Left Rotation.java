class Solution
{
    void reverse(long arr[] ,int low,int high){
        while(low<high){
            long t = arr[low] ;
            arr[low] = arr[high] ;
            arr[high]  =  t ;
            
            low++;
            high--;
        }
    }
    void leftRotate(long arr[], int k,int n)
    {
        k = k%n ;
        reverse(arr,0,k-1) ;
        reverse(arr, k,n-1) ;
        reverse(arr,0,n-1);
        
    }
}
