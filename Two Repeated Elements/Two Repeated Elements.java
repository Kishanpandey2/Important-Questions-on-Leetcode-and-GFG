// method 1
class Solution
{
    //Function to find two repeated elements.
    public int[] twoRepeated(int arr[], int N)
    {
        int[] ans = new int[2];
        int j=0;
        for(int i=0;i<N+2;i++){
            arr[Math.abs(arr[i])] = -1*arr[Math.abs(arr[i])];
            if(arr[Math.abs(arr[i])]>0){
                ans[j]=Math.abs(arr[i]);
                j++;
            }
        }
        return ans;
    }
    
}


//  method 2

class Solution
{

    public int[] twoRepeated(int arr[], int N)
    {
        int[] ans = new int[2];
        boolean flag = false;
        
        for(int i=0;i<N+2;i++){
            if(arr[Math.abs(arr[i])]>0)
            arr[Math.abs(arr[i])]= -arr[Math.abs(arr[i])];
            
            else
            {
                if(flag == false)
                {ans[0] = Math.abs(arr[i]);
                flag = true;}
                
                else
                ans[1] = Math.abs(arr[i]);
                
            }
        }
        return ans;
    }
    
}
