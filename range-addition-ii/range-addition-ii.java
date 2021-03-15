class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        int x=m;
        int y=n;
        for(int i=0;i<ops.length;i++)
        {
           x=Math.min(x,ops[i][0]);
            y=Math.min(y,ops[i][1]);
        }
        
        return x*y;
        
        
    }
    
    
}
