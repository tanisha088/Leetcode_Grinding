class Solution {
    public int maxProfit(int[] prices, int fee) {
            int t0 =0;
        int t1=Integer.MIN_VALUE;
        for(int i=0;i<prices.length;i++)
        {
            int temp = t0;
            t0 = Math.max(t0,t1+prices[i]);
            t1=Math.max(t1,temp-prices[i]-fee);
        }
        
        return t0;
    }
}