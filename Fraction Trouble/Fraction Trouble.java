class Solution
{
    public int[]  LargestFraction(int n, int d)
    {
       int num = -1  ;
       int den = 1;
       for(int i = 10000;i>1;i--)
       {
           int p = (n*i-1)/d ;
           
           if((gcd(p,i)==1) && (den*p>= num*i))
           {
               num = p ;
               den = i;
               
           }
       }
       return new int[]{num,den} ;
    }
    private int gcd(int a ,int b)
    {
        if(b ==0)
        return a ;
        return gcd(b,a%b);
    }
}
