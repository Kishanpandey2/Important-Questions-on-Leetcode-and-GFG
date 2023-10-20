
class Solution
{
    
    private static int lastInd(int []y , int n ,int ele){
        int l = 0 , h = n -1 ;
        int ans  = -1 ;
        while(l<=h){
            int mid = l+ ( h-l)/2 ;
            if(y[mid]>ele)
            {
                ans = mid ;
                h = mid-1 ;
            }
            else
            l = mid+1 ;
        }
        
        return ans ;
    }
    static long countPairs(int x[], int y[], int M, int N)
    {
        int zero = 0 , one = 0, two = 0 , three = 0 , four = 0 ;
        
        Arrays.sort(x) ;
        Arrays.sort(y) ;
        
        for(int i : y)
        {if(i == 0)
        zero++ ;
         if( i== 2)two++ ;
         if(i ==3)three++ ;
         if(i ==4)four++ ;
         if(i==1)one++;
        }
        long ans = 0 ;
        for(int i = 0 ;i<M;i++){
            if(x[i]==0)continue ;
            else if(x[i]==1)
            ans+=zero ;
            else if(x[i]==2){
                int ind = lastInd(y,N,2) ;
                if(ind!= -1)
                ans+=(N-ind) ;
                
                ans -=three ; ans -= four ;
                ans += one + zero ;
            }
            else {
                int ind = lastInd(y,N,x[i]) ;
                if(ind != -1)
                ans += (N-ind) ;
                
                ans += one+ zero ;
                if(x[i] == 3)
                ans += two ;
            }
        }
        
        return ans ;
    }
}
