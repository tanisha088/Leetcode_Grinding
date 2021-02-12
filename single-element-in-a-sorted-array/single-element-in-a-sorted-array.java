class Solution {
    public int singleNonDuplicate(int[] nums) {
        
        int lo=0;
        int hi=nums.length-1;
        while(lo<=hi)
        {
            int mid=lo+(hi-lo)/2;
            
            if(mid==0 || mid==nums.length-1 || (nums[mid-1]!=nums[mid] && nums[mid+1]!=nums[mid]))
                return nums[mid];
            if((nums[mid]==nums[mid-1] && (mid-1)%2!=0) || (nums[mid]==nums[mid+1] && (mid)%2!=0))
                hi=mid-1;       
            else
                lo=mid+1;
        }
        
        return lo;
    }
}