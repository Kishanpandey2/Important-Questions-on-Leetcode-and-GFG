// Naive solution or brute force solution 
class Solution{
    
    public static int maxAND (int arr[], int N) {
        int ans = 0  ;
        for(int i = 0 ;i<N;i++){
            for(int j = i+1;j<N;j++){
                ans = ans>(arr[i]&arr[j])?ans:(arr[i]&arr[j]) ;
            }
        }
        return ans ;
    }
    
}



// Efficient solution 

class Solution{
    public static int checkBitCount(int pattern, int[]arr,int n){
        int c = 0 ;
        for(int i = 0 ;i<n;i++){
            if((pattern&arr[i])==pattern)
            c++;
        }
        return c ;
    }

    public static int maxAND (int arr[], int N) {
        int ans = 0 , count ;
        for(int bit = 31 ;bit>=0;bit--){
            count = checkBitCount(ans | (1<<bit),arr,N) ;
            
            if(count>=2)
            ans |= (1<<bit);
        }
        return ans;
    }
    
}
