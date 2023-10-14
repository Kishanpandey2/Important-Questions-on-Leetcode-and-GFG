
class Solution
{
    
    public static boolean find3Numbers(int A[], int n, int X) { 
    
       Arrays.sort(A) ;
       
       for(int i =0 ;i<n-2;i++){
           if(i>0 && A[i]==A[i-1])continue ;
           int l = i+1, h = n-1 ;
           int sum = A[i] ;
           while(l<h){
               int tempSum = sum+ A[l]+A[h] ;
               if( tempSum== X)
               return true ;
               else if(tempSum <X)
               l++ ;
               else h-- ;
           }
       }
       return false ;
    
    }
}
