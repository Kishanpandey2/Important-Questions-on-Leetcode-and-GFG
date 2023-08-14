// Method 1  using Merge sort

class Solution {
    public static int NumberofElementsInIntersection(int a[], int b[], int n, int m) {
        Arrays.sort(a);
        Arrays.sort(b);
        
        int i  = 0 , j = 0 ;
        int cnt = 0 ;
        while(i<n && j<m)
        {
            if(i>0 && a[i]==a[i-1])
            {
                i++  ; continue ;
            }
            
            if(a[i]>b[j])
            j++ ;
            else if(a[i]<b[j])
            i++ ;
            else
            {
                cnt++; i++ ;j++;
            }
        }
        return cnt ;
    }
};


// Method 2 using Set
class Solution {
    public static int NumberofElementsInIntersection(int a[], int b[], int n, int m) {
        HashSet<Integer> set = new HashSet<>() ;
         int c =0 ;
        for(int x :a)
        set.add(x) ;
        for(int x :b)
        {
            if(set.contains(x))
            {
                c++ ;
                set.remove(x) ;
            }
        }
        return c ;
    }
};
