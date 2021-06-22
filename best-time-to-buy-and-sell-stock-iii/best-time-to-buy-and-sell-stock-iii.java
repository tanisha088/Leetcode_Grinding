class Solution {
    public int maxProfit(int[] prices) {
//        A[i][2][0] = max(A[i-1][2][0],A[i-1][2][1]+(prices[i]))
//A[i][2][1] = max(A[i-1][2][1],A[i-1][1][0]-prices[i])
//A[i][1][0] = max(A[i-1][1][0],A[i-1][1][1]+(prices[i]))
//A[i][1][1] = max(A[i-1][1][1],A[i-1][0][0]-prices[i])

        int t01 =0;
        int t02 =0;
        int t11 = Integer.MIN_VALUE;
        int t12 = Integer.MIN_VALUE;
        
        for(int i=0;i<prices.length;i++)
        {
            t02 =  Math.max(t02,t12+prices[i]);
            t12 = Math.max(t12,t01-prices[i]);
            t01 = Math.max(t01,t11+prices[i]);
            t11 = Math.max(t11,0-prices[i]);
        }
        
        return Math.max(t02,t01);
    }
}