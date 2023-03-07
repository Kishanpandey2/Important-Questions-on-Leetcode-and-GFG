

class Solution {
    long wineSelling(int Arr[],int N){
 
      
        int buy =0  ;
        int sell = 0 ;
        long ans =0 ;
        while(buy<N && sell<N)
        {
            while(Arr[buy]<=0)
            {
                buy++ ;
                if(buy == N)
                return ans ;
            }
             while(Arr[sell]>=0)
            {
                sell++ ;
                if(sell == N)
                return ans ;
            }
            if(Math.abs(Arr[buy])>= Math.abs(Arr[sell]))
            {
                ans+=Math.abs(buy-sell)*Math.abs(Arr[sell]) ;
                Arr[buy]+=Arr[sell] ;
                Arr[sell]=0 ;
            }
            else
            {
                ans+=Math.abs(buy-sell)*Math.abs(Arr[buy]) ;
                Arr[sell]+=Arr[buy] ;
                Arr[buy]=0 ;
            }
            
            
        }
        return ans;
    }
}
