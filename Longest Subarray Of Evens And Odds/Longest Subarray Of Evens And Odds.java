// Brute Force solution 


  
class Solution
{
    
    public static int maxEvenOdd(int arr[], int n)
    {
        int ans = 0 ;
       for(int i =0 ;i<n;i++)
       {
           int cur = 1 ;
           for(int j = i+1;j<n;j++)
           {
               if((arr[j]%2!=0 && arr[j-1]%2==0) || (arr[j]%2==0 && arr[j-1]%2!=0))
               cur++;
               else
               break;
           }
           ans = Math.max(ans , cur);
       }
       return ans;
    }
}

// Efficient solution 


 

  
class Solution
{
    
    public static int maxEvenOdd(int arr[], int n)
    {
        int ans = 1 ; int cur = 1;
       for(int j =1 ;j<n;j++)
       {
               if((arr[j]%2!=0 && arr[j-1]%2==0) || (arr[j]%2==0 && arr[j-1]%2!=0))
               {cur++;ans = Math.max(ans , cur);}
               else

                    
                    cur = 1;
           }
         
       
       return ans;
    }
}
