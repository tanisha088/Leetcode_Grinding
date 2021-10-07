class Solution {
    public int findPairs(int[] nums, int k) {
        
       HashSet<String> set =  new HashSet<String>();
        int ans=0;
        HashMap<Integer,Integer> h = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++)
        {
            int a= Math.min(nums[i],nums[i]-k);
            int b = Math.max(nums[i],nums[i]-k);
            int c = Math.min(nums[i],nums[i]+k);
            int d= Math.max(nums[i],nums[i]+k);
            
            
            String a1 =   a+" "+b;
            String b1 =   c+" "+d;
            if(h.containsKey(nums[i]-k) && !set.contains(a1))
            {
            set.add(a1);
            ans+=1;
            }
            
             if(h.containsKey(k+nums[i]) && !set.contains(b1))
            {
            set.add(b1);
            ans+=1;
            }
     //       System.out.println(set);
            
          h.put(nums[i],h.getOrDefault(nums[i],0)+1);
        }
        
        if(k!=0)
            return ans;
        ans=0;
        for(Map.Entry<Integer,Integer> e:h.entrySet())
        {
            if(e.getValue()>1)
                ans+=1;
        }
        
        return ans;
    }
}