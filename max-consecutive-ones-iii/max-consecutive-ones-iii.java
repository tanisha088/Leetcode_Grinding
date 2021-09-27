class Solution {
    public int longestOnes(int[] nums, int k) {
      
        int st=0;
        int end=0;
        int ans=0;
        int count=k;
        while(end<nums.length)
        {
            if(nums[end]==0)
                count--;
            
            while(count<0)
            {
                if(nums[st]==0)
                    count++;   
                st++;
            }
            
           ans = Math.max(end-st+1,ans);
            
           end++;
            
        }
        
        return ans;
    }
}


/*



*/