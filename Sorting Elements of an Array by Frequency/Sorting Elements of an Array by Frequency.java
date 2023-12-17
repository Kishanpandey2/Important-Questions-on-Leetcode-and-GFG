
class Solution
{
    static ArrayList<Integer> sortByFreq(int arr[], int n)
    {
       ArrayList<Integer>ans = new ArrayList<>() ;
       
       Map<Integer,Integer>map = new HashMap<>() ;
       for(int i  : arr){
           ans.add(i) ;
           map.put(i,map.getOrDefault(i,0)+1) ;
       }
       
       Collections.sort(ans,(n1,n2) ->
       {
           int frq1 = map.get(n1) ;
           int frq2 = map.get(n2) ;
           
           if(frq1 != frq2)
           return frq2 - frq1 ;
           
           return n1-n2 ;
       }) ;
       
       return ans;
    }
}
