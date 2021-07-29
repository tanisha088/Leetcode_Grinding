class Solution {
    public int maxSubArray(int[] nums) {
        
     int maxsum=Integer.MIN_VALUE;
        int  cursum=0;
        for(int i=0;i<nums.length;i++)
        {
            // if(sum+nums[i]<0)
            // {
            //      max=Math.max(max,sum+nums[i]);
            //     sum=0;
            // }
            // else
            // {
            //     sum+=nums[i];
            //  max=Math.max(max,sum);
            // }
            
                cursum+=nums[i];
maxsum=Math.max(cursum,maxsum) ;
        
    cursum = cursum<0?0:cursum;
    
        }
        
        return maxsum;
    }
}



