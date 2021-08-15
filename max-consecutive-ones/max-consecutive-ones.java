class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
       
        int res=0;
        int count=0;
        for(int i:nums)
        {
            if(i==1)
                count++;
            else
            {
                count=0;
            }
             res=Math.max(res,count);
        }
        
        return res;
        
    }
}