class Solution{
    public static int countOnes(int a[], int N){
        int l = 0 , h = N -1 ;
        int ind = 0 ;
        while(l<=h){
            int m = l+(h-l)/2 ;
            if(a[m]==0)
            h = m-1 ;
            else {
                if(m==N-1 || a[m+1]!=a[m])
                return (m+1) ;
                else
                l= m+1;
            }
        }
        return 0;  
    }
}

