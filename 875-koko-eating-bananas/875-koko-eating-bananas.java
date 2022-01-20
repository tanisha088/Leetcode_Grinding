class Solution {
    public int minEatingSpeed(int[] piles, int H) {
        
        int lo = 1;
        int hi = 0;
        for(int el:piles)
            hi=Math.max(el,hi);
        
        int ans = hi;
        
        while(lo<=hi)
        {
            int mid  = lo + (hi-lo)/2;
      
            if(isok(mid,piles,H))
            {
                ans = Math.min(mid,ans);
                hi = mid-1;
            }
            else
                lo = mid+1;
        }
        
        return ans;
          
    }
    
    public boolean isok(int mid,int[] piles,int h)
    {
        
        int ans = 0;
       for(int i=0;i<piles.length;i++)
           ans= ans + (int)(Math.ceil((piles[i]*1.0)/mid));
        
        return ans<=h?true:false;
        
    }
}