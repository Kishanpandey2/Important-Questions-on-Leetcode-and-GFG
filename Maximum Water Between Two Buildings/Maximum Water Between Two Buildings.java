
class Solution
{
   
    static int maxWater(int height[], int n) 
    { 
        if(n<=2)return 0 ;
       int ans = 0 ;
       
       int i = 0 , j = n -1 ;
       while(i<j)
       {
           ans = Math.max(ans , (j-i-1)*(int)Math.min(height[i],height[j]));
           if(height[i]<=height[j])
           i++;
           else
           
           j--;
       }
        return ans;
    } 

}
