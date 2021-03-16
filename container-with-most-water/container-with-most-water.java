class Solution {
    public int maxArea(int[] height) {
        
        int i=0;
        int j=height.length-1;
        int ans=0;
        while(i<j)
        {
            ans=Math.max(ans,(j-i)*Math.min(height[j],height[i]));
            if(height[i]<height[j])
                i++;
            else
                j--;
        }
        return ans;
    }
}