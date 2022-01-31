class Solution {
    public int maximumWealth(int[][] accounts) {
        int max=0;     
        for(int  i=0;i<accounts.length;i++)
        {
            int tot=0;
            for(int j:accounts[i])
                tot+=j;
            
            max=Math.max(tot,max);
        }
        
        return max;

    }
}