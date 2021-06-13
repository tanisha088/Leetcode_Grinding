class Solution {
    public int subarraySum(int[] nums, int k) {
        
        HashMap<Integer,Integer> h= new HashMap<Integer,Integer>();
        h.put(0,1);

        for(int i=1;i<nums.length;i++)
        {
            nums[i]+=nums[i-1];
        }
        int ans=0;
        
        for(int i=0;i<nums.length;i++)
        {
            int sum= nums[i];
            if(h.containsKey(sum-k))
                ans+=h.get(sum-k);
            h.put(nums[i],h.getOrDefault(nums[i],0)+1);
        }
        
    //    System.out.println(h);
        
        return ans;
        
    }
}