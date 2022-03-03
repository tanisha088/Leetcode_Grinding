class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        if(nums.length<3)
            return 0; 
        int  i = 1;
        int count=0;
        int iter =0;
        while(i<nums.length)
        {
              int diff = nums[i]- nums[i-1];
              i++;
              iter=0;
            while(i<nums.length && nums[i]-nums[i-1]==diff)
            {
                i++;
                iter++;
                count = count + iter;
            }
        }
        return count;
    }
}
                                     
                    