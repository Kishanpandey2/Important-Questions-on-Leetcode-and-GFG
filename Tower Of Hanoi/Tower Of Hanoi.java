class Hanoi {
    long ans = 0  ;
    public long toh(int N, int A, int C, int B) { 
        if(N == 0)
            {
                
                return  ans ;
            }
            toh( N-1 , A, B,C) ;
             System.out.println("move disk "+N+" from rod "+A+" to rod "+C) ;
             ans++;
              toh( N-1 , B,C, A) ;
              
       return ans  ;
    }
  
}
