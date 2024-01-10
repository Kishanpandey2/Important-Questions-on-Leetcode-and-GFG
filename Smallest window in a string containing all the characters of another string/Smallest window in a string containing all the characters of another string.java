
class Solution
{
    public static String smallestWindow(String s, String p)
    {
      if(p.length()>s.length())return "-1" ;
      
      if(s.equals(p))return s ;
      
      Map<Character,Integer>pMap = new HashMap<>() ;
      Map<Character,Integer>sMap = new HashMap<>();
        
        for(char ch : p.toCharArray())
        pMap.put(ch,pMap.getOrDefault(ch,0)+1) ;
      
      String res = "-1" ;
      int resLen = Integer.MAX_VALUE;
      
      int curLen = 0 , totalLen = pMap.size();
      int l = 0 , r= 0 ; 
      int n = s.length();
      while(r<n){
          char ch1 = s.charAt(r) ;
          sMap.put(ch1,sMap.getOrDefault(ch1,0)+1);
          
          if(pMap.containsKey(ch1) && pMap.get(ch1)== sMap.get(ch1))
          curLen++ ;
          
          while(curLen == totalLen){
              if((r-l+1)<resLen)
              {
                  res = s.substring(l,r+1);
                  resLen = Math.min(resLen,r-l+1);
              }
              
              char ch2 = s.charAt(l) ;
              sMap.put(ch2,sMap.get(ch2)-1);
              
              if(pMap.containsKey(ch2) && sMap.get(ch2)<pMap.get(ch2))
              curLen--;
               l++;
              
          }
          r++;
      }
      
      return resLen==Integer.MAX_VALUE?"-1":res;
      
    }
}
