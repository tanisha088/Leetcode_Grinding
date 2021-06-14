class Solution {
    public int maxProduct(int[] nums) {
     
      int res=nums[0];
        int lans=0;
        int rans=0;
        
        for(int i=0;i<nums.length;i++)
        {
           lans = nums[i] * (lans==0?1:lans);
            rans = nums[nums.length-1-i] * (rans==0?1:rans);
            
            res=Math.max(res,Math.max(lans,rans));
        }
    
        return res;
        
        
      //   public int maxProduct(int[] A) {
    
    }
}