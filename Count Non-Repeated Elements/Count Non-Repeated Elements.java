
class Solution
{
    // arr[]: input array
    // n: size of array
    
    //Function to return the count of non-repeated elements in the array.
    static long countNonRepeated(int arr[], int n)
    {
       Map<Integer,Integer>map =  new HashMap<>() ;
       
       for(int i : arr)
       map.put(i,map.getOrDefault(i,0)+1) ;
       
       int cnt = 0 ;
       
       for(Integer i : map.values())
       if(i == 1)cnt++;
       
       return cnt;
    }
}
