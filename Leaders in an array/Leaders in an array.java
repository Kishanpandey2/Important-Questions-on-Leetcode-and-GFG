
class Solution{
    
    static ArrayList<Integer> leaders(int arr[], int n){
        ArrayList<Integer>ans = new ArrayList<>() ;
        if(n==1)
        {
            ans.add(arr[0]) ;
            return ans;
        }
        int max = arr[n-1] ;
        for(int i = n-2 ;i>=0 ;i--){
            if(max<=arr[i])
            {
                max = arr[i];
               
            }
            else
            arr[i] = 0 ;
         
        }
        
        for(int i :arr){
            if(i!=0)
            ans.add(i) ;
        }
        return ans ;
    }
}
