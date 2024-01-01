
class Solution
{
   
    public static int minIndexChar(String str, String patt)
    {
        Map<Character,Integer>map = new HashMap<>() ;
        
        for(int i = 0 ;i<str.length();i++)
        {
            if(!map.containsKey(str.charAt(i)))
            map.put(str.charAt(i),i) ;
        }
        
        int res = Integer.MAX_VALUE ;
        for(char ch : patt.toCharArray())
        if(map.containsKey(ch))
        res = Math.min(res,map.get(ch));
        
        return res!=Integer.MAX_VALUE?res:-1;
    }
}
