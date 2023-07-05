
class Solution {
    public static void convertToWave(int n, int[] a) {
        for(int i = 0;i<n-1;i++)
        {
            swap(a,i,i+1);
            i++;
        }
    }
    private static void swap(int []a,int i , int j)
    {
        int t = a[i] ;
        a[i] = a[j];
        a[j] = t;
    }
}
  
