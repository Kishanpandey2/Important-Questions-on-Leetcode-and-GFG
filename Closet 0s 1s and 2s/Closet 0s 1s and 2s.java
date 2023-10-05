
class Solution
{
    
    public static void segragate012(int arr[], int N){
        
        int low = 0 , mid = 0 , high = N-1 ;
        
        while(mid<=high){
            if(arr[mid]==0)
            {
                int t = arr[low] ;
                arr[low] =arr[mid] ;
                arr[mid] = t ;
                low++ ;
                mid++ ;
            }
            else if(arr[mid]==1)mid++ ;
            else
            {
                int t = arr[high] ;
                arr[high] =arr[mid] ;
                arr[mid] = t ;
                high-- ;
            }
        }
    }
}
