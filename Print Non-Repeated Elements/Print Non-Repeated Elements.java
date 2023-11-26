
class Solution
{
    
    static ArrayList<Integer> printNonRepeated(int arr[], int n)
    {
       ArrayList<Integer>ans = new ArrayList<>() ;
       
       Map<Integer,Integer>map = new HashMap<>() ;
       
       for(int i : arr)
       map.put(i,map.getOrDefault(i,0)+1) ;
       
       for(int i = 0 ;i<n;i++){
           if(i!=0 && arr[i] ==arr[i-1] )continue ;
           if(map.get(arr[i])== 1)
           ans.add(arr[i]);
       }
       
       return ans;
    }
}

