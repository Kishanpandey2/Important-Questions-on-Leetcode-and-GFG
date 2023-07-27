class Solution
{
    //Function to find maximum number of consecutive steps 
    //to gain an increase in altitude with each step.
    static int maxStep(int A[], int N)
    {
        int cnt = 0;
        int ans = 0 ;
       for(int i = 1;i<N;i++)
       {
           if(A[i]>A[i-1])
           {
               cnt++ ;
               ans = Math.max(ans,cnt);
           }
           else
           cnt = 0;
       }
      
        return ans;
    }
    
}
