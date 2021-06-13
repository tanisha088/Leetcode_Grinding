class Solution {
    public int maxOperations(int[] nums, int k) {
        HashMap<Integer,Integer> h= new HashMap<Integer,Integer>();
        for(int i:nums)
        {
            h.put(i,h.getOrDefault(i,0)+1);
        }
        int c=0;
        for(int i=0;i<nums.length;i++)
        {
            int m = h.getOrDefault(k-nums[i],-1);
            
            if(h.get(nums[i])>=1 && ((k-nums[i]==nums[i] && m>=2) || (k-nums[i]!=nums[i] &&  m>=1)))
            {
                c++;
                h.put(nums[i],h.get(nums[i])-1);
                h.put(k-nums[i],h.get(k-nums[i])-1);
            }
        }
        
        return c;
    }
}