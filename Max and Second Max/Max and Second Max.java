class Solution{
      public static ArrayList<Integer> largestAndSecondLargest(int sizeOfArray, int arr[])
    {
        int largest = Integer.MIN_VALUE;
        int sl = Integer.MIN_VALUE;
        for(int i = 0 ;i<arr.length;i++)
        {
            if(arr[i]>largest)
            {
                sl = largest;
                largest = arr[i] ;}
            else if(arr[i]!=largest && arr[i]>sl  )
            sl = arr[i];
        }
        if(sl == Integer.MIN_VALUE)
        sl = -1;
        ArrayList<Integer>ans = new ArrayList<>() ;
        ans.add(largest) ;
        ans.add(sl);
        return ans;
    }
}
