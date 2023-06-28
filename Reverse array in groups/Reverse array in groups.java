
class Solution {
     
    void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        for(int i = 0 ;i<n;i+=k)
        {
            if(i+k-1<n)
            reverse(arr,i,i+k-1) ;
            else
            reverse(arr,i,n-1) ;
        }
        
         
    }
    void reverse(ArrayList<Integer>arr, int start ,int end) 
    {
        while(start<end)
        {
            int temp = arr.get(start);
            arr.set(start,arr.get(end));
            arr.set(end,temp);
            start++;
            end--;
        }
    }
}
