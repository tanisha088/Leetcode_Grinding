class Solution {
    public int minCostClimbingStairs(int[] cost) {
/*
        int[] ways = {1,2};
        int[] dp= new int[cost.length];
        dp[0]=cost[0];
        for(int i=1;i<dp.length;i++)
            dp[i]=Integer.MAX_VALUE;
        if(cost.length<2)
            return dp[0];
        dp[1]=cost[1];
        for(int i=1;i<cost.length;i++)
        {
            for(int j=0;j<ways.length;j++)
            {
                if(ways[j]<=i)
                {
                    dp[i]=Math.min(dp[i],dp[i-ways[j]]+cost[i]);
                }
            }
        }
        
        return Math.min(dp[dp.length-1],dp[dp.length-2]);
        */
        
        
         int[] dp = new int[cost.length];
        dp[0]=cost[0];
        dp[1]=cost[1];
       if(cost.length==0)
                return 0;
            if(cost.length==1)
                return dp[0];
        
        for (int i = 2; i <cost.length;i++) {
            dp[i]  = Math.min(dp[i-1],dp[i-2])+cost[i];
      //      System.out.println(cost[i-1]+" "+cost[i-2]);
        }
        
        return Math.min(dp[dp.length-1],dp[dp.length-2]);
        /*
        
        int[] dp = new int[cost.length+1];
        dp[0]=cost[0];
        dp[1]=cost[1];
        for (int i = 2; i <=cost.length;i++) {
   dp[i] = Math.min(dp[i-1],dp[i-2]) + (i == cost.length ? 0 : cost[i]);
}
 
return dp[cost.length];
*/
    }
}