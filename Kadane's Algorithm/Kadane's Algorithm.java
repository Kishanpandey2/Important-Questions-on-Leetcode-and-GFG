
class Solution{

    
    long maxSubarraySum(int arr[], int n){
        
         long maxEnd = arr[0], ans = arr[0] ;
         for(int i = 1 ;i<n;i++)
         {
             maxEnd = Math.max(maxEnd+arr[i],arr[i]);
             ans = Math.max(ans,maxEnd);
         }
        return ans;
    }
    
}
