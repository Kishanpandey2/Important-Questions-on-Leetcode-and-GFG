class Solution
{
     long floorSqrt(long x)
	 {
		long low = 1 , high = x ;
		long ans = -1 ;
		while(low <= high)
		{
		    long mid = (low+high)/2 ;
		    long msq = mid*mid ;
		    
		    if(msq == x)
		    return mid ;
		    else if(msq>x)
		    high = mid - 1 ;
		    else
		    {
		        low = mid+1 ;
		        ans = mid ;
		    }
		}
		return ans;
	 }
}
