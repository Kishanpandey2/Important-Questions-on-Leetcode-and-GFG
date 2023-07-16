class Solution{
     
    static List<Integer> pattern(int N){
        List<Integer>ans = new ArrayList<>() ;
        int t = N;
        boolean flag = false;
        while(true)
        {
            ans.add(t) ;
            if(t<=0)
            flag = true;
            
            if(flag )
            t+= 5 ;
            else
            t-=5 ;
             
             if(t== N)
             break;
        }
        ans.add(t);
        return ans;
    }
}
