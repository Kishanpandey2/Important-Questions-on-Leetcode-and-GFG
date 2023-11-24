
class Solution{
    public static boolean check(long A[],long B[],int N)
    {
      Map<Long,Integer>map = new HashMap<>() ;
      
      for(Long i : A)
       map.put(i,map.getOrDefault(i,0)+1) ;
      
      for(Long i : B)
      if(!map.containsKey(i) || map.get(i)==0)
      return false;
      else
      map.put(i,map.get(i)-1) ;
      
      
      return true;
    }
}
