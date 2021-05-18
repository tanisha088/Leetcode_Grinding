class Solution {
    public int numEnclaves(int[][] grid) {
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(i==0 || j==0 || i==grid.length-1 || j==grid[0].length-1)
                {
                    if(grid[i][j]==1)
                    dfs(i,j,grid);
                }
            }
        }
        
        
        int res=0;
        
        for(int i=0;i<grid.length;i++)
            for(int j=0;j<grid[0].length;j++)
                if(grid[i][j]==1)
                    res++;
        
        return res;
    }
    
    public void dfs(int i,int j,int[][] grid)
    {
        grid[i][j]=0;
        int m=grid.length;
        int n=grid[0].length;
        int[] x=  {0,-1,0,1};
        int[] y=  {1,0,-1,0};
        for(int v=0;v<4;v++)
        {
            int nx=i+x[v];
            int ny=j+y[v];
            System.out.println(m+" "+n+" "+nx+" "+ny);
            if(nx>=0 && nx<m && ny>=0 && ny<n && grid[nx][ny]==1)
                dfs(nx,ny,grid);
                
        }
    }
}