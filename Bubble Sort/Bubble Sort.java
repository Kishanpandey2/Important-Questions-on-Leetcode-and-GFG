
class Solution
{
	public static void bubbleSort(int arr[], int n)
    {
        
        for(int i = 0 ;i<n-1;i++){
              boolean swap = false;
            for(int j = 0;j<n-i-1;j++){
                if(arr[j]>arr[j+1])
                {
                    int t  = arr[j] ;
                    arr[j]= arr[j+1] ;
                    arr[j+1] = t ;
                }
                swap = true ;
            }
            if(swap == false)break;
        }
    }
}
