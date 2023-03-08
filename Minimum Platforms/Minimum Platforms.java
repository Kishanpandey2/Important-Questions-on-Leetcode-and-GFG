class Solution
{
 
    static int findPlatform(int arr[], int dep[], int n)
    {
         Arrays.sort(arr) ;
         Arrays.sort(dep) ;
         int c = 0 ;
         int ans = 0 ;
         
         int  i= 0 ,j = 0 ;
         
         while(i<n){
             
             if(arr[i]<=dep[j]){
                 c++ ;
                 ans = Math.max(ans, c) ;
                 i++;
             }
             else{
                 c-- ;
                 ans = Math.max(ans, c) ;
                 j++;
             }
             
         }
         return ans ;
    }
    
}

