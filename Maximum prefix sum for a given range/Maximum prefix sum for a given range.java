

class Solution {
    long[] maxPrefixes(long a[], long L[], long R[], long N, long Q) 
    {    int n=(int)N;
       int q=(int)Q;
       long[]ans=new long[q];
       for(int i=0;i<q;i++)
       {
           int max=Integer.MIN_VALUE;
           int l=(int)L[i];
           int r=(int)R[i];
           int sum=0;
           for(int j=l;j<=r;j++)
           {
               sum+=a[j];
               if(sum>max)max=sum;
           }
           ans[i]=max;
       }
       return ans;
        
    }
}
