class Solution
{
    public void transpose(int n,int a[][])
    {
        for(int i = 0 ;i<a.length;i++)
        for(int j = i+1 ;j<a[0].length;j++)
        swap(a,i,j) ;
    }
    public void swap(int [][]a,int i,int j){
        int t1 = a[i][j] ;
        int t2 = a[j][i];
        
       
        a[i][j] = t2;
        a[j][i] = t1;
    }
}
