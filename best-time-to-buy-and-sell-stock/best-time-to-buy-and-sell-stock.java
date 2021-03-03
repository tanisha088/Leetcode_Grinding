class Solution {
    public int maxProfit(int[] prices) {
 
       int t0=0;
        int t1=Integer.MIN_VALUE;
       for(int i=0;i<prices.length;i++)
       {
           t0 = Math.max(t0,t1+prices[i]);
           t1 =Math.max(t1,0-prices[i]);
       }
        
        return t0;
    }
}