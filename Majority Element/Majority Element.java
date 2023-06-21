class Solution
{
    static int majorityElement(int a[], int size)
    {
        int ans_index = 0 ,count = 1 ;
    for(int i=1;i<size; i++){
    if(a[i]==a[ans_index])
    count++;
    else count-- ;
    if(count==0)
    {
        ans_index=i ;
        count=1  ;
    }
    }
        int c =0 ,ans = a[ans_index] ;
        for(int i=0;i<size;i++)
        {
            if(ans==a[i])
            c++;
        }
        if(c>(size/2))
        return a[ans_index] ;
        else 
        return -1 ;
    }
}
