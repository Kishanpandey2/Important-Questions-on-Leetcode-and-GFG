

class Solution
{
   
    public static String[] winner(String arr[], int n)
    {
        Map<String,Integer>map = new TreeMap<>() ;
        
        for(String str : arr)
        map.put(str,map.getOrDefault(str,0)+1) ;
        
        
        
        String []ans = new String[2] ;
        
        int max= Integer.MIN_VALUE;
        for(Map.Entry<String,Integer>entry : map.entrySet())
        {
            if(entry.getValue()>max)
            {
                ans[0] =entry.getKey()  ;
                ans[1] = String.valueOf(entry.getValue());
                max= entry.getValue();
            }
        }
        return ans;
    }
}

