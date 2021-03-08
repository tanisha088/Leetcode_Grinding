class Solution {
    public int minScoreTriangulation(int[] values) {
        
        int[][] dp=new int[values.length][values.length];
    
        for(int i=0;i<values.length-2;i++)
        {
            dp[i][2+i]=values[i]*values[i+1]*values[i+2];
        }
        
        for(int gap=3;gap<values.length;gap++)
        {
            for(int left=0;left<values.length-gap;left++)
            {
                int right = left + gap;
                int ans=Integer.MAX_VALUE;
                for(int i=left+1;i<right;i++)
                {
                    int ans1= dp[left][i]+dp[i][right]+values[left]*values[i]*values[right];
                    ans=Math.min(ans,ans1);
                //    System.out.println(left+" "+i+" "+right+" "+ans1);
                }
                
                dp[left][right]=ans;
            }
        }
    /*    
        for(int i=0;i<values.length;i++)
        {
            for(int j=0;j<values.length;j++)
            {
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
        
        */
        return dp[0][values.length-1];
        
    }
}