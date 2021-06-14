class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
       HashMap<Integer,Integer> h= new HashMap<Integer,Integer>();
       h.put(0,1);
        int res=0;
  
        
        for(int i=0;i<nums.length;i++)
        {
            int prev= res;
            res+=nums[i];
            int val = res<0? (res%k+k)%k : res%k;
            int prevv  = prev<0 ? prev%k+k : prev%k;
      
            System.out.println(prevv+" "+val);
            if(prevv==val && h.get(prevv)==1)
            {
                 h.put(val,h.getOrDefault(val,0)+1);
                continue;
            }
        
            if(h.containsKey(val))
                return true;
            h.put(val,h.getOrDefault(val,0)+1);
        }
        
        return false;
    }
}
