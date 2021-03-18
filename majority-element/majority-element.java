class Solution {
    public int majorityElement(int[] nums) {
       
        int fp=0;
      
        int fc=0;
        
        for(int i=0;i<nums.length;i++)
        {
          if(fc==0 || fp==nums[i])
          {
              fp=nums[i];
              fc++;
          }
            else
            {
                fc--;
            }
        }
        
        return fp;
    }
}

       
       
       