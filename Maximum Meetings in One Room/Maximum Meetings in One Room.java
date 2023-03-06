class Solution {
    public static ArrayList<Integer> maxMeetings(int N, int[] S, int[] F) {
        ArrayList<Integer> ans = new ArrayList<>() ;
        int [][]ar = new int[N][3] ;
        
        for(int i = 0 ;i<N;i++){
            ar[i][0] = i+1 ;
            ar[i][1] =  S[i];
            ar[i][2] =  F[i];
        }
        
        Arrays.sort(ar, Comparator.comparingInt(o -> o[2])) ;
        int rgt = ar[0][2];
        
        ans.add(ar[0][0]);
        
        for(int i = 1;i<ar.length ;i++){
            if(ar[i][1]>rgt)
            {
                ans.add(ar[i][0]);
                rgt = ar[i][2];
            }
        }
        
        Collections.sort(ans);
        
        return ans ;
    }
}
        
