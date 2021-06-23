class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        /*
       String res="";
        int[][] dp= new int[text1.length()+1][text2.length()+1];
        for(int i=1;i<=text1.length();i++)
        {
            for(int j=1;j<=text2.length();j++)
            {
                if(text1.charAt(i-1)==text2.charAt(j-1))
                {
                    dp[i][j]=dp[i-1][j-1]+1;
                    res=res+text1.charAt(i-1);
                }
                else
                {
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        
        System.out.println(res);
        
        return dp[text1.length()][text2.length()];
        */
        
     /*
        int[][] arr= new int[text1.length()+1][text2.length()+1];
        for(int i=1;i<text1.length()+1;i++)
        {
            for(int j=1;j<text2.length()+1;j++)
            {
                if(text1.charAt(i-1)==text2.charAt(j-1))
                    arr[i][j]=arr[i-1][j-1]+1;
                else
                {
                    arr[i][j]=Math.max(arr[i-1][j],arr[i][j-1]);
                }
            }
        }
        
        return arr[text1.length()][text2.length()];
    }
   
    
      */
        
        
        
        
    int[] dp = new int[text2.length()+1];
        
        for(int i=1;i<=text1.length();i++)
        {
            int prev=0;
            for(int j=1;j<=text2.length();j++)
            {
                int prev1 = dp[j];
                if(text2.charAt(j-1)==text1.charAt(i-1))
                {
                    dp[j]=prev+1;
                }
                else
                {
                    dp[j] = Math.max(dp[j],dp[j-1]);
                }
                
                prev= prev1;
            }
            
            for(int j=0;j<=text2.length();j++)
                System.out.print(dp[j]+" ");
            
            System.out.println();
        }
        
        return dp[text2.length()];
}
}