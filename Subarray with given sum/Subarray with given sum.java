// Brute or Naive solution 

class Solution
{
    
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        // Brute Force solution
        ArrayList<Integer> ans = new ArrayList<>() ;
        int sum ;
        for(int i = 0 ;i<n;i++)
        {
            sum = arr[i] ;
            if(sum == s)
            {
                  ans.add(i+1); ans.add(i+1);
                  return ans;
            }
            for(int j = i+1;j<n;j++)
            { sum+= arr[j];
                if(sum == s)
                {
                    ans.add(i+1); ans.add(j+1);
                    return ans;
                }
               
            }
        }
        if(ans.size()==0)
        ans.add(-1);
        return ans;
    }
}


// Efficient solution

class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        // Brute Force solution
      ArrayList<Integer> result = new ArrayList<>();
        int j =0;
        for(int i =0; i<n; i++){
            sum += arr[i];
            while (sum>s && j<i){
                sum -= arr[j];
                j++;
            } 
            if(sum == s){
                result.add(j+1);
                result.add(i+1);
                return result;
            }
        }
        result.add(-1);
        return result;
    }
}
