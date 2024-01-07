class Solution
{
    public static int primeDigits(int n)
    {
        int p = 0 ;
        
            int temp = 2 , m = 0 ;
        while(p<n){
            m = temp ;
            
            while(m>0)
            {
                int d = m%10 ;
                if(d == 2 ||d == 3 || d==5 || d==7)
                {
                    m/=10 ;
                }
                else
                break;
            }
            if(m == 0)
            p++ ;
            
            temp++;
        }
        
        return temp-1 ;
    }
}
