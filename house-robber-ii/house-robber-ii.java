class Solution {
    public int rob(int[] nums) {
        
        int[] dp1= new int[nums.length];
        int[] dp2 =new int[nums.length];
         if(nums.length==0)
            return 0;
        if(nums.length==1)
            return nums[0];
        dp1[0]=nums[0];
        dp1[1]=Math.max(nums[0],nums[1]);
        for(int i=2;i<dp1.length;i++)
        {
          //  System.out.println(dp1[i-1]+" "+dp1[i-2]);
            dp1[i]=Math.max(dp1[i-1],dp1[i-2]+nums[i]);
        }
        dp2[0]=0;
        dp2[1]=nums[1];
        for(int i=2;i<dp1.length;i++)
        {
            dp2[i]=Math.max(dp2[i-1],dp2[i-2]+nums[i]);
        }
        
        int ans1=0;
        int ans2=dp2[nums.length-1];
      
       ans1=(dp1[nums.length-2]);
        System.out.println(ans1+" "+ans2);
        return Math.max(ans1,ans2);
    }
}