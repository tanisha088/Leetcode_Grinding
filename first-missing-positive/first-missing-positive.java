class Solution {
    public int firstMissingPositive(int[] nums) {
        
        if(nums.length==0)
           return 1;
        
       for(int i=0;i<nums.length;i++)
           if(nums[i]<=0)
               nums[i]=0;
        
        for(int i=0;i<nums.length;i++)
        {
            int val = Math.abs(nums[i]);
            if(val<nums.length && nums[val]>=0)
            {
              nums[val]= (nums[val]== 0?0-nums.length-2:-1*nums[val]);
            }
        }
        
        int m =-1;
        
        for(int i=0;i<nums.length;i++)
        {
            System.out.println(nums[i]);
            if(Math.abs(nums[i])==nums.length)
            {
                m=nums.length;
            }
            if(nums[i]>=0 && i!=0)
                return i;
        }
        System.out.println(m);
       if(m==nums.length)
           return m+1;
        
        return nums.length;
    }
}