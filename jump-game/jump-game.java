class Solution {
    public boolean canJump(int[] nums) {
        boolean[] dp= new boolean[nums.length];
        dp[nums.length-1]=true;
        for(int i=nums.length-2;i>=0;i--)
        {
            for(int j=0;j<=nums[i]&& (i+j)<nums.length;j++)
            {
                if(dp[i+j])
                {
                    dp[i]=true;
                    break;
                }
            }
        }
        
        return dp[0];
            
    }
}