class Solution
{
    
  public int modInverse(int a, int m)
    {
       for(int i = 1 ;i<=m;i++)
       {
           if((a * i )% m ==1 )
           return i ;
       }
       return -1 ;
    }

}
