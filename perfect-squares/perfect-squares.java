class Solution {
    public int numSquares(int n) {
        
        int[] dp= new int[n+1];
        dp[0]=0;
        dp[1]=1;
        
        for(int i=1;i<=Math.sqrt(n);i++)
            dp[i*i]=1;
        
        for(int i=2;i<=n;i++)
        {
            if(dp[i]==1)
                continue;
            int ans=i;
            for(int j=1;j<=Math.sqrt(i);j++)
            {
                ans = Math.min(ans,dp[j*j]+dp[i-j*j]);
            }
          //  System.out.println(ans);
            dp[i]=ans;
        }
        
        return dp[n];
    }
}