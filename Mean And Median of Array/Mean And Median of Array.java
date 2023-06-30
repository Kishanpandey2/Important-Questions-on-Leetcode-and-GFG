
class Solution
{
   
  public int median(int A[],int N)
    {
      if(N==1)
      return A[0];
       Arrays.sort(A);
       int med = 0 ;
       if(N%2==0)
       med = (A[N/2]+A[N/2 -1])/2 ;
       else
       med = A[N/2];
       return med;
       
    }
   
    public int mean(int A[],int N)
    {
       int sum = 0 ;
       for(int i :A)
       sum +=i ;
       
       return sum/N;
    }

}
