class Solution {
    int maximumSumRectangle(int R, int C, int M[][]) {
       int sum [] = new int [R] ;
       int mxSum = Integer.MIN_VALUE  ;
       for(int cStart =0 ;cStart<C;cStart++){
           Arrays.fill(sum,0) ;
          for(int cEnd = cStart ;cEnd<C;cEnd++){
              for(int row = 0 ;row<R;row++){
                  sum[row] += M[row][cEnd] ;
              }
              int curMxSum = kadanAlgo(sum) ;
              mxSum = Math.max(mxSum,curMxSum) ;
          }
          
       }
       return mxSum ;
    }
    int kadanAlgo(int []ar){
     int maxSoFar = Integer.MIN_VALUE , maxEndingHere = 0 ;
     for(int i = 0 ;i<ar.length ;i++){
         maxEndingHere += ar[i]  ;
         
         if(maxEndingHere>maxSoFar)
         maxSoFar=maxEndingHere ;
        
         if(maxEndingHere<0)
         maxEndingHere=0 ;
         
     }
     return maxSoFar ;
    }
};
