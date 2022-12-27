class Solution {
    public int maxArea(int[] height) {
        int len  = height.length;
        int i = 0 ,j = len-1 ;
        int mxar = 0 ;
        int width  = 0 , hght = 0 ;
        while(i<=j)
        {
            if(height[i]<height[j])
            {
            width = j-i ;
            hght = Math.min(height[i],height[j]);
            i++;
            }
            else
            {
                width = j-i ;
            hght = Math.min(height[i],height[j]);
            j--; 
            }
            int t = width * hght ;
            if(t>mxar)
            mxar = t ;
        }
        return mxar;
    }
}


Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).
