class Solution {
    
    int r=0;
    int steps=0;
    
    public int orangesRotting(int[][] grid) {
        
        int[][] dp= new int[grid.length][grid[0].length];
        
        for(int i=0;i<grid.length;i++)
        {
            Arrays.fill(dp[i],Integer.MAX_VALUE);
        }
        
        HashSet<String> set = new HashSet<String>();
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(!set.contains(grid[i][j]) && grid[i][j]==2)
                {
                    dfs(grid,set,i,j,dp,0);
                }
            }
        }
        int max = Integer.MIN_VALUE;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]==1)
                    max=Math.max(dp[i][j],max);
            }
        }
        
        if(max==Integer.MIN_VALUE)
            return 0;
        return max==Integer.MAX_VALUE?-1:max;
    }
    
    
    public void dfs(int[][] grid,HashSet<String> set,int i,int j,int[][] dp,int steps)
    {
        
        if(dp[i][j]<=steps)
            return;
        
        dp[i][j] = steps;
        
            set.add(i+" "+j);
            
        int[] x = {-1,1,0,0};
        int[] y = {0,0,1,-1};
        
        for(int k=0;k<4;k++)
        {
            int nx= x[k]+i;
            int ny= y[k]+j;
            
            if(nx>=0 && ny>=0 && nx<grid.length && ny<grid[0].length && grid[nx][ny]==1)
            {
                dfs(grid,set,nx,ny,dp,steps+1);
            }
        }
    }
    
    
    
}