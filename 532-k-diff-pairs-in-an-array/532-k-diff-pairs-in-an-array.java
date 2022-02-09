class Solution {
    public int findPairs(int[] nums, int k) {
        
        HashSet<Integer> h=  new HashSet();
        int num=0;
        HashSet<Integer> ss =  new HashSet();
        for(int i:nums)
        {
              if(h.contains(i))
                ss.add(i);
            
            h.add(i);
          
        }
        
        if(k==0)
            return ss.size();
        
        for(int i:h)
        {
            if(h.contains(i+k))
                num++;
        }
        
        return num;
        
    }
}


