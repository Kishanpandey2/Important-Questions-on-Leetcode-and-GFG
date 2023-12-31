
class Solution
{
    public static char getMaxOccuringChar(String line)
    {
         Map<Character,Integer>map = new HashMap<>() ;
         
         for(char ch : line.toCharArray())
         map.put(ch,map.getOrDefault(ch,0)+1) ;
         
         int max = 0 ;
         char ch = ' ' ;
         for(Map.Entry<Character,Integer>entry : map.entrySet())
         {
             if(entry.getValue()>max)
             {
                 max = entry.getValue() ;
                 ch = entry.getKey();
             }
             else if(entry.getValue() == max && entry.getKey() < ch)
             {
                 ch = entry.getKey();
             }
             
         }
         
         return ch ;
    }
    
}
