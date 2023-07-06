class Solution{
   
    public static int maxOccured(int L[], int R[], int n, int maxx){
        int []freq = new int[1000001] ;
        for(int i = 0 ;i<L.length;i++)
        {
            freq[L[i]] +=1 ;
            freq[R[i]+1]-=1 ;
        }
        
        for(int i = 1 ;i<1000001;i++)
        freq[i] = freq[i]+freq[i-1] ;
      
      
        int ans = 0;
      
          for(int i = 1 ;i<1000001;i++)
       {
           if(freq[i]>freq[ans]){
               ans = i;
           }
            
       }
       return ans;
    }
    
}
