class Solution {
    public boolean canJump(int[] nums) {
        // DP APPROACH 
        /*
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
      */
        
        /*
        //GREEDY APPROACH
        
        int fastest=0;
        for(int i=0;i<nums.length;i++)
        {
            if(i>fastest)
                return false;
            fastest = Math.max(fastest,nums[i]+i);
            
        }
        return (fastest>=nums.length-1)?true:false;
        */
        
        int max=nums[0];
        
        for(int i=1;i<nums.length;i++)
        {
            if(i>max)
                return false;
            
            max= Math.max(max,nums[i]+i);
        }
        
        return true;
    }
}