
class Solution
{
    int findMaxDiff(int a[], int n)
    {
	int[] ls = new int[n];
    int[] rs = new int[n];
    int p=n-1;
    int k=0;
    for(int i=0;i<n;i++)
    {   int min=0;
        for(int j=0;j<=i;j++)
        {
            if(a[j]<a[i])
            {
                min=a[j];
            }
        }
        ls[k++]=min;
        
    }
    for(int i=n-1;i>=0;i--)
    {   int min=0;
        for(int j=n-1;j>=i;j--)
        {
            if(a[j]<a[i])
            {
                min=a[j];
            }
        }
        rs[p--]=min;
        
    }
    
    int max = Integer.MIN_VALUE;
    for(int i=0;i<n;i++)
    {
        int diff = Math.abs(ls[i]-rs[i]);
        if(diff>max)
        {
            max=diff;
        }
    }
    return max;
    
    }
}
