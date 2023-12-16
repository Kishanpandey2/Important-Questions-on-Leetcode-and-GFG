// Method 1

class Solution
{   
    // arr[] : the input array
    // N : size of the array arr[]
    
    //Function to return length of longest subsequence of consecutive integers.
	static int findLongestConseqSubseq(int arr[], int n)
	{
	   Arrays.sort(arr) ;
	   
	   int cur = 1 ;
	   
	   int res = 1  ;
	   for(int i = 1 ;i<n;i++)
	   {
	      
	       if(arr[i]== (arr[i-1]+1))cur++ ;
	       else if(arr[i]!= arr[i-1])
	       {
	           res = Math.max(res,cur) ;
	           cur=1 ;
	       }
	   }
	   
	   return Math.max(res,cur);
	}
}


// Method 2 using Set

class Solution
{   
	static int findLongestConseqSubseq(int arr[], int n)
	{
	   Set<Integer>st = new HashSet<>() ;
	   for(int i : arr)
	   st.add(i) ;
	   
	   int res = 1 ;
	   for(int i : arr)
	   {
	       if(!st.contains(i-1))
	       {
	           int cur = 1 ;
	           
	           while(st.contains(i+cur))
	           cur++ ;
	           
	           res = Math.max(res,cur) ;
	       }
	   }
	   
	   return res;
	}
}
