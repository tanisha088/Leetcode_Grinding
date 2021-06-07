class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer,Integer> h= new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++)
            h.put(nums[i],i);
        int ans=0;
        for(int i=0;i<nums.length;i++)
        {
            if(!h.containsKey(nums[i]-1))
            {
                int st = nums[i]-1;
                int el=st+1;
                while(h.containsKey(el))
                {
                    el++;
                }
                ans=Math.max(ans,el-st-1);
            }
        }
        
        return ans;
    }
}