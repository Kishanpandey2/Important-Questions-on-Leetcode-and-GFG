
class Solution{
     
    ArrayList<ArrayList<Integer> > stockBuySell(int A[], int n) {
       ArrayList<ArrayList<Integer> >  ans = new ArrayList<>() ;
       for(int i = 0;i<n-1;i++)
       {
           if(A[i+1]>A[i]){
               ArrayList<Integer>temp = new ArrayList<>();
               temp.add(i);
               temp.add(i+1);
               ans.add(temp);
           }
       }
       return ans;
    }
}
