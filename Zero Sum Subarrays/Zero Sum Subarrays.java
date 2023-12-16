 

class Solution{
     
    public static long findSubarray(long[] arr ,int n) 
    {
        Map<Long,Integer>map  =new HashMap<>()  ;
        
        map.put(0l,1) ;
        long sum = 0 ;
        long ans =  0 ;
        for(long  l:arr)
        {
            sum += l ;
            
            if(map.containsKey(sum))
            {
                ans += map.get(sum ) ;
                map.put(sum,map.get(sum)+1) ;
            }
            else
            map.put(sum,1) ;
        }
        
        return ans ;
    }
}
