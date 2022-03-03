class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
  
        if(nums.length<3)
            return 0;
        
        int  i = 0;
        int count=0;
        int iter =0;
        int diff = nums[1]- nums[0];
        i=2;
        while(i<nums.length)
        {
            while(i<nums.length && nums[i]-nums[i-1]==diff)
            {
                i++;
                iter++;
                count = count + iter;
            }
            
            if(i==nums.length)
                break;
            diff = nums[i] - nums[i-1];
            i++;
            iter=0;
        }
        
        return count;
        
    }
}
                                     
                    