class Solution
{
     
    static int minNumber(int arr[], int low, int high)
    {
        int ans = Integer.MAX_VALUE ;
        while(low<=high){
            int mid = low+ ( high - low)/2;
            
            if(arr[low]<= arr[high])
            {
                ans = Math.min(ans,arr[low]);
                break;
            }
            
            if(arr[low]<=arr[mid])
            {ans = Math.min(ans,arr[low]);
             low = mid+1;
            }
            else
            {
                high = mid-1;
                ans = Math.min(ans,arr[mid]);
            }
             
        }
        
        return ans;
    }
}
