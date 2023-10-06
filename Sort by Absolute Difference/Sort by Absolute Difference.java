// Method 1

class Solution
{
    static void sortABS(List<Integer> arr, int n, int k)  
    {
        Collections.sort(arr,(a,b) -> Math.abs(k-a)-Math.abs(k-b)) ;
    }
}
