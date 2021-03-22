class Solution {
    public int firstMissingPositive(int[] nums) {
     
        for(int i=0;i<nums.length;i++)
            nums[i] = (nums[i]<=0)?nums.length+2:nums[i];
        
        for(int i=0;i<nums.length;i++)
        {
            if(Math.abs(nums[i])-1<nums.length)
            {
                if(nums[Math.abs(nums[i])-1]>0)
                nums[Math.abs(nums[i])-1]*=-1;
                
            }
        }
        
        for(int i=0;i<nums.length;i++)
            if(nums[i]>0)
                return i+1;
        return nums.length+1;
     
    }
}