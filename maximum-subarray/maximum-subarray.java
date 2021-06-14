class Solution {
    public int maxSubArray(int[] nums) {
        
     int max=Integer.MIN_VALUE;
        int  sum=0;
        for(int i=0;i<nums.length;i++)
        {
            if(sum+nums[i]<0)
            {
                 max=Math.max(max,sum+nums[i]);
                sum=0;
            }
            else
            {
                sum+=nums[i];
             max=Math.max(max,sum);
            }
        }
        
        return max;
    }
}


