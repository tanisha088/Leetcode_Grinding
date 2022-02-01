class Solution {
    public int maxProfit(int[] prices) {
 
       int min =0;
        int max =-1;
        for(int i:prices)
        {
            if(max==-1)
                max = i;
            else
            {
                min =Math.max(min,i-max);
                
                max = Math.min(max,i);
            }
        }
        
        return min;
          
    }
}