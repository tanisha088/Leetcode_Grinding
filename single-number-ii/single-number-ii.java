class Solution {
    public int singleNumber(int[] nums) {
    
        int res =0;
                
        for(int i=0;i<32;i++)
        {
            int ans = 0;
            
            for(int n : nums)
            {
             if(((n>>i)&1)==1)
                 ans++;
            }
            
            if(ans%3==0)
                continue;
            int m = 1<<i;
            res=res|m;
        }
        
        return res;
    }
}