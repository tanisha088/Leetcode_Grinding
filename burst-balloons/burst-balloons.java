class Solution {
    public int maxCoins(int[] nums) {
        
        int[] arr=  new int[nums.length+2];
        arr[0]=1;
        
        for(int i=0;i<nums.length;i++)
        {
            arr[i+1]=nums[i];
        }
        
        arr[arr.length-1]=1;
     //   for(int i=0;i<arr.length;i++)
       //     System.out.println(arr[i]);
        int[][] dp= new int[arr.length][arr.length];
        return comb(arr,0,arr.length-1,dp);
    }
    
    public int comb(int[] nums,int left,int right,int[][] dp)
    {
        if(dp[left][right]>0)
            return dp[left][right];
        int ans=0;
        for(int i=left+1;i<right;i++)
        {
            int leftsum = comb(nums,left,i,dp);
            int rightsum = comb(nums,i,right,dp);
            ans=Math.max(ans,leftsum+rightsum+nums[left]*nums[right]*nums[i]);
            
        }
     //   System.out.println(left+" "+right+" "+ans);
        dp[left][right]=ans;
        return ans;
    }
}