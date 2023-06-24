/// Brute force or Naive solution of this problem 

class Solution {

    
    
    public static int equilibriumPoint(long arr[], int n) {

        for(int i =0 ;i<n;i++)
        {
            int ls = 0 , rs = 0 ;
            for(int j = 0 ;j<i ;j++)
            ls+=arr[j] ;
                for(int j = i+1;j<n ;j++)
            rs+=arr[j] ;
            if(ls == rs)
            return i+1 ;
        }
        return -1;
    }
}



/// Efficient solution 

class Solution {

    public static int equilibriumPoint(long arr[], int n) {

            long rs = 0 ;
            for(long i : arr)
            rs+= i ;
            long ls = 0 ;
            for(int i = 0 ;i<n;i++)
            {
                rs-=arr[i];
                if(ls == rs)
                return i +1 ;
                ls+=arr[i] ;
                
            }
            return -1;
    }
}
