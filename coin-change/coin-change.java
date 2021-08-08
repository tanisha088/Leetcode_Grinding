class Solution {
    public int coinChange(int[] coins, int amount) {
        /*
        int[] dp= new int[amount+1];
        for(int i=1;i<dp.length;i++)
        {
            dp[i]=Integer.MAX_VALUE;
            for(int j=0;j<coins.length;j++)
            {
                if(coins[j]<=i && dp[i-coins[j]]!=Integer.MAX_VALUE)
                dp[i]=Math.min(dp[i],dp[i-coins[j]]+1);
            }
        }
                   
        return (dp[amount]==Integer.MAX_VALUE?-1:dp[amount]);
        */
        
  //  *****USING NEW TECHNIQUE JO YOUTUBE SE SEEKHI******//    
    
        /*
        int[][] dp= new int[coins.length+1][amount+1];
        for(int i=0;i<dp.length;i++)
        {
            Arrays.fill(dp[i],Integer.MAX_VALUE-1);
            dp[i][0]=0;
        }
    
        
        
        for(int i=1;i<=coins.length;i++)
        {
            for(int j=0;j<=amount;j++)
            {
                dp[i][j]=dp[i-1][j];
                if(j-coins[i-1]>=0)
                dp[i][j]= Math.min(1+dp[i][j-coins[i-1]],dp[i][j]);
            }
        }
        
        return dp[coins.length][amount]==Integer.MAX_VALUE-1?-1:dp[coins.length][amount];
        */
        
        
        //*** SAME YOUTUBE TECHNIQUE WITH ONE ARRAY ***//
        
        /*
        int[] dp= new int[amount+1];
        Arrays.fill(dp,Integer.MAX_VALUE-1);
        dp[0]=0;
         for(int i=1;i<=coins.length;i++)
            for(int j=1;j<=amount;j++)
                if(j-coins[i-1]>=0)
                dp[j]= Math.min(1+dp[j-coins[i-1]],dp[j]);
        
        
        return dp[amount]==Integer.MAX_VALUE-1?-1:dp[amount];
        */
        
        
        int[] res =new int[amount+1];
        res[0]=0;
        
        for(int i=1;i<amount+1;i++)
        {
            int max= Integer.MAX_VALUE;
            for(int j=0;j<coins.length;j++)
            {
                if(coins[j]>i)
                    continue;
                
                if(res[i-coins[j]]!=Integer.MAX_VALUE)
                max= Math.min(max,res[i-coins[j]]+1);
            }
            
            res[i]=max;
        }
        
        
        return res[res.length-1]==Integer.MAX_VALUE?-1:res[res.length-1];
        
        
        
        
        /*
        
        
        1,2,5
        
        */
       
    }
        
}
    
    
    
    
    