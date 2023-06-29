
class Solution {
    .
    public int majorityWins(int arr[], int n, int x, int y) {
        int cntx =0 , cnty = 0  ;
        for(int i :arr)
        {
            if(i == x)
            cntx++ ;
            if(i==y)
            cnty++ ;
        }
        if(cnty==cntx)
        {
            if(x>y)
            return y ;
            else
            return x;
        }
        else if(cntx>cnty)
        return x ;
        else
        return y;
    }
}
