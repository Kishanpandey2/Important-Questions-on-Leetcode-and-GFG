class Solution
{
    static int betBalance(String result)
    {
        int bet = 1 ;
        int sum = 4; 
        for(int i = 0 ;i<result.length();i++)
        {if( bet>sum)
            return -1 ;
            if(result.charAt(i)=='W')
            {
               
                sum += bet; bet = 1 ;
            }
            if(result.charAt(i)=='L')
            {
                sum -= bet ;
                bet = bet*2 ;
                
            }
            
        }
        return sum;
    }
}
