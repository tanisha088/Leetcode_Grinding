class Solution {
    public int jump(int[] nums) {
       
        for(int i=nums.length-2;i>=0;i--)
        {
            int minval=Integer.MAX_VALUE;
            for(int j=1;j<=nums[i];j++)
            {
               if(nums[j+i]==Integer.MAX_VALUE)
                   continue;
                if(j+i>=nums.length-1)
                {
                    minval=1;
                    break;
                }
                minval=Math.min(minval,nums[i+j]+1);
            }
            nums[i]=minval;
        }
        if(nums.length==1)
            return 0;
        return nums[0];
        
    }
}