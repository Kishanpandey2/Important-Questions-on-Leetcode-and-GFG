
class Solution{
    public static int MinimumDifference(int arr[], int n)
    {
        int min = Integer.MAX_VALUE  ;
        Arrays.sort(arr) ;
        
        for(int i = 0 ;i<n-1;i++)
        {
            int diff = arr[i+1]-arr[i] ;
            if(diff<min)
            min = diff ;
        }
        
        return min ;
    }
};
