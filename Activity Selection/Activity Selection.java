class Solution
{
   
    public static int activitySelection(int S[], int E[], int n)
    {
        
        int [][]ar = new int[n][3] ;
        
        for(int i = 0 ;i<n;i++){
            ar[i][0] = i+1 ;
            ar[i][1] =  S[i];
            ar[i][2] =  E[i];
        }
        
        Arrays.sort(ar, Comparator.comparingInt(o -> o[2])) ;
        int rgt = ar[0][2];
        int ans = 1 ;
      
        
        for(int i = 1;i<ar.length ;i++){
            if(ar[i][1]>rgt)
            {
                ans++;
                rgt = ar[i][2];
            }
        }
        
        
        
        return ans ;
    }
}
