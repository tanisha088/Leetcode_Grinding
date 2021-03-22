class Solution {
    public int[] findErrorNums(int[] nums) {

        
        // find missing ->then duplicate using xor of 1,n
        
        int[] ans= new int[2];
        int tot=0;
        int ptot=0;
        for(int i=0;i<nums.length;i++)
        {
            tot = tot ^ (i+1);
            
            if(nums[Math.abs(nums[i])-1]>0)
            {
                nums[Math.abs(nums[i])-1]*=-1;
                ptot = ptot ^ Math.abs(nums[i]);
            }
            else
            {
                ans[0]=Math.abs(nums[i]);
            }
        }
        
        ans[1]=tot^ptot;
        return  ans;
    }
}