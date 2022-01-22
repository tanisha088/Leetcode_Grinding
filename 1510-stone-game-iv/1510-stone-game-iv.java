class Solution {
 
    public boolean winnerSquareGame(int n) {
        boolean[] dp = new boolean[n+1];
        for(int cur=1;cur<=n;cur++){
            for(int i=1;i*i<=cur;i++){
                if(!dp[cur-i*i]){
                    dp[cur]=true;
                    break;
                }
            }
        }
        return dp[n];
 
    }
}



