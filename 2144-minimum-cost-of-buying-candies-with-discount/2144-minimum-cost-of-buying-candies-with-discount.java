class Solution {
    public int minimumCost(int[] cost) {
        
        Arrays.sort(cost);
        int tot=0;
        
        for(int i=cost.length-1;i>=0;)
        {
            tot = tot + cost[i--];
            if(i>=0)
                tot=tot+cost[i--];
            
            i--;
        }
        
        return tot;
    }
}