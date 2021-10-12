class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        if(nums.length<3)
            return 0;
        int psize=2;
        int tot=0;
        int psum=nums[1]-nums[0];
        for(int i=2;i<nums.length;i++)
        {
            if(nums[i]-nums[i-1]!=psum)
            {
             psum  = nums[i]-nums[i-1];   
                psize=2;
            }
            else
            {
                psize++;
                tot = tot + Math.max(0,psize-2);
            }
        }
        
        return tot;
    }
}
                                     
                                //     a b c d