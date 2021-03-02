class Solution {
    public int minimumDeleteSum(String st1, String st2) {
        char[] s1 = st1.toCharArray();
    char[] s2 = st2.toCharArray();
      int n1 = s1.length, n2 = s2.length;
        int[][] dp = new int[n1+1][n2+1] ;
        for (int i1 = 1; i1 <=n1; ++i1) for (int i2 = 1; i2 <=n2; ++i2)  {
            int ans = 0;
            if(s1[i1-1]!=s2[i2-1])
            ans = Math.max(dp[i1][i2-1], dp[i1-1][i2]);
            else ans = Math.max(ans, (int)s1[i1-1] + dp[i1-1][i2-1]);
            dp[i1][i2] = ans;
        }
        int ret = 0;
        for (int c:s1) ret +=c;
        for (int c:s2) ret +=c;
        ret -= 2*dp[n1][n2];
        return ret;   
    }
}