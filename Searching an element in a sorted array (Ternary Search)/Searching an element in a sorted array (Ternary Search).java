class Solution{

    static int ternarySearch(int arr[], int N, int K)
    {
        int low  = 0 , high = N-1 ;
        while(high>= low){
            
            int m1 = low + (high-low)/3 ;
            int m2 = high - (high-low)/3 ;
            
            if(arr[m1]== K)
            return 1 ;
            if(arr[m2]== K)
            return 1 ;
            
            if(arr[m1]>K)
            high = m1-1 ;
            else if(arr[m2]<K)
            low = m2+1 ;
            else
            {
                low = m1+1 ;
                high = m2-1 ;
            }
        }
        
        return -1;
    }
}
