 int posOfRightMostDiffBit(int m, int n)
    {
        int c = 1 ;
        if(m==n)
        return -1 ;
        while(n>=0 && m>=0){
            if((n&1)== (m&1))
            c++ ;
            else
            break ;
            n>>=1 ; m>>=1 ;
        }
        return c ;
    }
