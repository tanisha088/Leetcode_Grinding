class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        
        int tot=0;
        for(int i:gas)
            tot+=i;
        for(int i:cost)
            tot-=i;
        
        if(tot<0)
            return -1;
        
        
    int i=0;
        int j=0;
        int n = gas.length;
        for( i=0;i<n;i+=(j+1))
        {
            tot=0;
            for( j=0;j<n;j++)
            {
               tot = tot + gas[(i+j)%n]-cost[(i+j)%n];
                if(tot<0)
                    break;
            }
            
            if(j==n)
                return i;
        }
        
        return -1;
     
    }
}



/*

1,2,3,4,5

3,4,5,1,2

sum(g[i]-cost[i]) - cost[i-1] 



*/