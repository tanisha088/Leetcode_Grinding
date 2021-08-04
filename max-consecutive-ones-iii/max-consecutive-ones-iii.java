class Solution {
    public int longestOnes(int[] nums, int k) {
        int max=0;
        int st=0;
        int end=0;
        int ones=0;
        int zeros=0;
        while(end<nums.length)
        {
            if(nums[end]==1)
                ones++;
            else
                zeros++;
           
            end++;
            while(ones+k<end-st)
            {
                if(nums[st]==0)
                    zeros--;
                else
                    ones--;
                st++;
            }
            
          
            max = Math.max(max,end-st);
        }
        
        return max;
    }
}


/*



*/