class Solution {
    public int minDistance(String word1, String word2) {
//         int[][] dp= new int[word1.length()+1][word2.length()+1];
//         for(int i=0;i<word1.length()+1;i++)
//         {
//             for(int j=0;j<word2.length()+1;j++)
//             {
//                 // V,.V..V.V..V. IMP 
//                 if(i==0 || j==0)
//                 {
//                     dp[i][j]=(i==0?j:i);
//                     continue;
//                 }
//                 if(word1.charAt(i-1)==word2.charAt(j-1))
//                     dp[i][j]=dp[i-1][j-1];
//                 else
//                 {
//                     dp[i][j]=Math.min(dp[i][j-1]+1,Math.min(dp[i-1][j-1]+1,dp[i-1][j]+1));
//                 }
//             }
//         }
        
//         return dp[word1.length()][word2.length()];
        
        
        
        
        int[][] ans=  new int[word1.length()+1][word2.length()+1];
        
        for(int i=0;i<word1.length()+1;i++)
        {
            ans[i][0]=i;
        }
        
        for(int j=0;j<=word2.length();j++)
        {
            ans[0][j]=j;
        }
        
        for(int i=1;i<=word1.length();i++)
        {
            for(int j=1;j<=word2.length();j++)
            {
                if(word1.charAt(i-1)!=word2.charAt(j-1))
                {
                    ans[i][j]= 1+Math.min(ans[i-1][j],Math.min(ans[i-1][j-1],ans[i][j-1]));
                }
                else ans[i][j] = ans[i-1][j-1];
            }
        }
        
        return ans[word1.length()][word2.length()];

    /*
    
     eyre
       mye
    */
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}