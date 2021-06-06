class Solution {
    public int subarraySum(int[] nums, int k) {
         HashMap<Integer,Integer> h = new HashMap<Integer,Integer>();
        
        
        h.put(0,1);
        int res=0;
        int size=0;
        for(int i=0;i<nums.length;i++)
        {
            res+=nums[i];
            if(h.containsKey(res-k))
                size+=h.get(res-k);
           int k1 = h.getOrDefault(res,0);
            h.put(res,k1+1);
           
        }
         
    return size;
    }
}