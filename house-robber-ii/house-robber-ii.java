class Solution {
    public int rob(int[] nums) {
        
        /*
        //agar phla wala rob karo toh last wale ko rob karne ka mauka hi na do
        // agar phla wala rob na karo toh 1st wale ka ans hamesha nums[1] hi rahega and hence last wale ko rob karne ka mauka do.
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
        */
        
        int[] a1 = new int[nums.length];
        int[] a2 = new int[nums.length];
        
        
        
        a1[0]=nums[0];
        
        if(nums.length==1)
            return nums[0];
        
        a1[1]=Math.max(nums[0],nums[1]);
        
        a2[0]=0;
        a2[1]=nums[1];
        
        if(nums.length==2)
            return Math.max(nums[0],nums[1]);
        
        for(int i=2;i<nums.length-1;i++)
        {
            a1[i]=Math.max(a1[i-1],a1[i-2]+nums[i]);
            a2[i]=Math.max(a2[i-1],a2[i-2]+nums[i]);
        }
        
        a2[a2.length-1]=Math.max(a2[a2.length-2],a2[a2.length-3]+nums[a2.length-1]);
       
        return Math.max(a1[a1.length-2],a2[a2.length-1]);
    }
}