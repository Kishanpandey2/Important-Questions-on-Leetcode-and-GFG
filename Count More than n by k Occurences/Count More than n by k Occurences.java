class Solution 
{
    //Function to find all elements in array that appear more than n/k times.
    public int countOccurence(int[] arr, int n, int k) 
    {
        Map<Integer,Integer>map = new HashMap<>() ;
        for(int i : arr)
        map.put(i,map.getOrDefault(i,0)+1) ;
        
        int cnt = 0 , occ = n/k;
        
        for(Integer i : map.values()){
            if(i>occ)
            cnt++;
        }
        return cnt;
    }
}
