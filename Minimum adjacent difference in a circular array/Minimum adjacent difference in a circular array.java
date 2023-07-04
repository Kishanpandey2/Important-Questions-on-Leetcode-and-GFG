class Solution{
   
    public static int minAdjDiff(int arr[], int n) {
        
        int ans = Integer.MAX_VALUE;
        for(int i = 0 ;i<n-1;i++)
        {
            ans  = Math.min(ans, Math.abs(arr[i+1]-arr[i]));
        }
        ans = ans  = Math.min(ans, Math.abs(arr[n-1]-arr[0]));
        return ans;
    }
}
