// Brute force solution or Naive solution 
class Solution 
{
 
    public static int findPages(int[]a,int n,int k)
    {
        if(k>n)
        return -1;
      if(k==1)
      return sum(a,0,n-1) ;
      
      if(n==1)
      return a[0] ;
      
      int res = Integer.MAX_VALUE ;
      for(int i = 1;i<n;i++)
      {
          res = Math.min(res,Math.max(findPages(a,i,k-1),sum(a,i,n-1))) ;
      }
      return res;
    }
    private static int sum(int  []a, int ind , int end){
        int sum = 0 ;
        for(int i= ind;i<=end;i++)
        sum+= a[i] ;
        
        return sum;
    }
};


// Efficient solution 
class Solution 
{
    private static boolean isPossible(int []a,int k , int ans ){
        int sum = 0 , req = 1 ;
       
        for(int i = 0 ;i<a.length ;i++)
        {
            if(sum+a[i]>ans)
            {
                req++;
                sum = a[i] ;
            }
            else
            sum+=a[i];
        }
        return (req<=k) ;
    }
    public static int findPages(int[]a,int n,int k)
    {
        if(k>a.length)
        return -1;
        int sum =0 , mx = 0 ;
        for(int i : a)
        {
            sum+=i ;
            mx = Math.max(mx,i);
        }
        int res = 0 ;
        int low = mx , high = sum ;
        while(low<= high)
        {
            int mid = (low+high)/2 ;
            
            if(isPossible(a,k,mid))
            {
                res = mid ;
                high = mid-1 ;
            }
            else
            low= mid+1;
        }
        return res;
    }
};
