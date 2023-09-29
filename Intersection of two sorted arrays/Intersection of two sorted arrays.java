
class Solution
{
    
    static ArrayList<Integer> printIntersection(int arr1[], int arr2[], int n, int m) 
    {
        ArrayList<Integer> ans = new ArrayList<>() ;
        
        int i = 0 ,j = 0 ;
        while( i<n && j<m){
            
            if(i>0 && arr1[i]==arr1[i-1]){
                i++ ;continue ;
            }
            
            if(arr1[i]>arr2[j])
            j++ ;
            else if(arr1[i]<arr2[j])
            i++ ;
            else
            {
                ans.add(arr1[i]) ;i++ ; j++  ;
            }
        }
        return ans;
    }

}

