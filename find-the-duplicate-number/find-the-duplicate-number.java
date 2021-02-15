class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int lo=0;
        int hi=nums.length-1;
        int ans=0;
        while(lo<=hi)
        {
            int mid = lo + (hi-lo)/2;
            System.out.println(mid+" "+lo+" "+hi);
            if(mid<=nums[mid]-1)
                lo=mid+1;
            else
            {
                ans=nums[mid];
                hi=mid-1;
            }
                
        }
        
        return ans;
    }
}