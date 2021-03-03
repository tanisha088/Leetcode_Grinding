class Solution {
    public int maxProfit(int k, int[] prices) {
        if(k>=(prices.length/2))
        {
                  int t0 =0;
        int t1=Integer.MIN_VALUE;
        for(int i=0;i<prices.length;i++)
        {
            int temp = t0;
            t0 = Math.max(t0,t1+prices[i]);
            t1=Math.max(t1,temp-prices[i]);
        }
        
        return t0;
        }
        else
        {
   //         A[i][k][0] = max(A[i-1][k][0],A[i-1][k][1]+(prices[i]))
//A[i][k][1] = max(A[i-1][k][1],A[i-1][k-1][0]-prices[i])

            
            int[] t0 =  new int[k+1];
            int[] t1 = new int[k+1];
            
            for(int i=0;i<t1.length;i++)
                t1[i]=Integer.MIN_VALUE;
            int max=0;
            for(int i=0;i<prices.length;i++)
            {
                for(int j=k;j>0;j--)
                {
                    t0[j] = Math.max(t0[j],t1[j]+prices[i]);
                    t1[j] = Math.max(t1[j],t0[j-1]-prices[i]);
                }
               
            }
            
            for(int i=0;i<=k;i++)
                max=Math.max(max,t0[i]);
            
            
            return max;
        }
    }
}