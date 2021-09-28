class Solution {
    public int minimumDeleteSum(String str1, String str2) {
        char[] s1 = str1.toCharArray();
    char[] s2 = str2.toCharArray();
      int n1 = s1.length, n2 = s2.length;
        int[][] dp = new int[n1+1][n2+1] ;
        // String[][] arr= new String[n1+1][n2+1];
        // for (int i1 = 1; i1 <=n1; ++i1) for (int i2 = 1; i2 <=n2; ++i2)  {
        //     int ans = 0;
        //     if(s1[i1-1]!=s2[i2-1])
        //     ans = Math.max(dp[i1][i2-1], dp[i1-1][i2]);
        //     else ans = Math.max(ans, (int)s1[i1-1] + dp[i1-1][i2-1]);
        //     dp[i1][i2] = ans;
        // }
        // int ret = 0;
        // for (int c:s1) ret +=c;
        // for (int c:s2) ret +=c;
        // ret -= 2*dp[n1][n2];
        // return ret;   
        
        for(int i=1;i<=n1;i++)
        {
            dp[i][0] = (int)str1.charAt(i-1)+dp[i-1][0];
        }
        
        for(int j=1;j<=n2;j++)
        {
            dp[0][j]=(int)str2.charAt(j-1) + dp[0][j-1];
        }
        
        for(int i=1;i<=n1;i++)
        {
            for(int j=1;j<=n2;j++)
            {
               // if(str1.charAt(i-1)==str2.charAt(j-1))
                    dp[i][j]= dp[i-1][j-1] ;
                if(str1.charAt(i-1)!=str2.charAt(j-1))
                {
                    dp[i][j] = Math.min((int)str1.charAt(i-1)+(int)str2.charAt(j-1)+dp[i-1][j-1],Math.min(dp[i-1][j]+(int)str1.charAt(i-1),dp[i][j-1]+(int)str2.charAt(j-1))); 
               
                }
            }
        }
        
     
        
        
        return dp[str1.length()][str2.length()];
        
    }
}






/*


sea -  eat

-  e a t
s  0 
e  1 1 1
a  0 2 0

*/