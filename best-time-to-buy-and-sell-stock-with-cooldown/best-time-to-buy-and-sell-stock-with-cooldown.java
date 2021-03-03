class Solution {
    public int maxProfit(int[] prices) {
        
         //       A[i][0] = max(A[i-1][0],A[i-1][1]+(prices[i]))/
//A[i][1] = max(A[i-1][1],A[i-2][0] -prices[i])

               int tpree=0;
                int t0 =0;
        int t1=Integer.MIN_VALUE;
        for(int i=0;i<prices.length;i++)
        {
            int temp=t0;
            t0 = Math.max(t0,t1+prices[i]);
            t1=Math.max(t1,tpree-prices[i]);
            tpree=temp;
        }
        
        return t0;
    }
}