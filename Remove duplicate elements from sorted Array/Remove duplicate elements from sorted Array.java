class Solution {
    int remove_duplicate(int A[],int N){
        int res = 1 ;
        for(int i = 1;i<N;i++)
        {
            if(A[res-1]!=A[i])
            {
                A[res] = A[i] ;
                res++ ;
            }
        }
        return res; 
    }
}
