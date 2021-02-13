class Solution {
    public int search(int[] nums, int t) {
           
        int lo=0;
        int hi=nums.length-1;
        
        while(lo<=hi)
        {
            int mid = lo+(hi-lo)/2;
            if(nums[mid]==t)
                return mid;
            if(nums[mid]<t)
            {
                lo=mid+1;
            }
            else
                hi=mid-1;
        }
        
        return -1;
    
    }
}