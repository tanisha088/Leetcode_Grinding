class Solution {
    public int splitArray(int[] nums, int m) {
        
        int lo =0;
        int hi =0;
        for(int i:nums)
        {
            hi+=i;
        }
        
        int ans=Integer.MAX_VALUE;
        while(lo<=hi)
        {
            int mid = (lo+(hi-lo)/2);
            int pos=1;
            int co=0;
            int j=0;
            while(j<nums.length)
            {
                if(nums[j]>mid)
                {
                    pos=m+1;
                    break;
                }
                if((co+nums[j]>mid))
                   {
                       pos++;
                       co=nums[j];
                   }
                   else
                   {
                       co+=nums[j];
                   }
                   j++;
            }
            
           // System.out.println(mid+" "+pos);
            if(pos>m)
            {
                lo=mid+1;
            }
            else
                hi=mid-1;
        }
        
        
        return lo;
        
    }
}