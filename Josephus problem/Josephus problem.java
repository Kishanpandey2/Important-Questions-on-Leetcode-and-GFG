class Solution
{
   public int josephus(int n, int k)
    {
      return myJos(n,k)+1 ;
    }
    
    int myJos(int n,int k){
        if(n==1)
        return 0 ;
        
        return (myJos(n-1,k)+k)%n ;
    }

}
