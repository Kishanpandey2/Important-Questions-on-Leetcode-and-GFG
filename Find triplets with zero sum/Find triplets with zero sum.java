
class Solution
{
	public boolean findTriplets(int arr[] , int n)
    {
        if(n<3)return false ;
        
        Arrays.sort(arr) ;
     for(int i = 0 ;i<n-2;i++)
     {
          if(search(arr,arr[i],i+1,n-1)) 
          return true;
     }
     
     return false;
    }
    boolean search(int []arr, int sum ,int i,int j){
        while(i<j){
            int tSum = sum + arr[i]+arr[j] ;
          
            if(tSum == 0)return true ;
            else if(tSum >0)
            j-- ;
            else i++ ;
        }
        return false;
    }
}
