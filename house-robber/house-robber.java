class Solution {
    public int rob(int[] nums) {
        /*
        if(nums.length==0)
            return 0;
        if(nums.length==1)
            return nums[0];
        nums[1]=Math.max(nums[0],nums[1]);
        for(int i=2;i<nums.length;i++)
        {
            nums[i]=Math.max(nums[i-1],nums[i-2]+nums[i]);
        }
        
        return nums[nums.length-1];
        */
        
        // Recursive fn good but TLE
       // return fn(nums,0,false,0);
        
        
        int[] ans = new int[nums.length];
        ans[0]=nums[0];
        if(ans.length==1)
            return ans[0];
        ans[1]= Math.max(nums[1],nums[0]);
        
        for(int i=2;i<nums.length;i++)
        {
            ans[i]=Math.max(ans[i-1],ans[i-2]+nums[i]);
        }
        
        return ans[ans.length-1];
    }
    
    public int fn(int[] nums,int ind,boolean f,int ans)
    {
        if(ind>=nums.length)
            return ans;
        
        if(f==false)
        {
            return Math.max(fn(nums,ind+1,true,ans+nums[ind]),fn(nums,ind+1,false,ans));
        }
        else
            return fn(nums,ind+1,false,ans);
    }
    
}