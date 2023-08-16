
class Solution
{
  
    static long inversionCount(long arr[], long N)
    {
       int l = 0 , r = (int)(N-1) ;
       return cntInv(arr,l,r);
    }
    static private long cntInv(long []arr,int l,int r){
        long res = 0 ;
        if(l<r)
        {
            int m = l+(r-l)/2 ;
         res+= cntInv(arr,l,m);
         res+= cntInv(arr,m+1,r);
         res += cntAndMerge(arr,l,m,r);
        }
        return res;
    }
    
    static private long cntAndMerge(long []arr,int l , int m , int r){
        int n1 = m-l+1 , n2 = r - m ;
        
        long []left = new long[n1];
        long []right = new long[n2];
        
        for(int i = 0 ;i<n1;i++)
        {
            left[i] = arr[l+i];
        }
            
        for(int i = 0 ;i<n2;i++)
        {
            right[i] = arr[m+1+i];
        }
        
        long res = 0 ;
        int i = 0 , j = 0 , k = l;
        
        while(i<n1 && j<n2)
        {
            if(left[i]<= right[j])
            {
                arr[k] = left[i] ; i++;
            }
            else
            {
                arr[k] = right[j] ;j++ ;
                res += (n1-i);
            }
            k++;
        }
        
        while(i<n1)
        {
            arr[k]= left[i] ; i++ ; k++;
        }
        while(j<n2)
        {
            arr[k]= right[j] ; j++ ; k++;
        }
        
        return res;
    }
    
}
