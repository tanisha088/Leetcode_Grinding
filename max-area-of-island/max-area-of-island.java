class Solution {
    
    public int maxAreaOfIsland(int[][] grid) {
      
        int con=0;
      //  boolean[][] vertices= new boolean[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if( grid[i][j]==1)
                {
                   
              int res = dfs(i,j,grid.length,grid[0].length,grid);
                  con=Math.max(con,res);
                }
            }
        }

        return con;
    }

    public int dfs(int i,int j,int n,int m, int[][] grid)
    {
        grid[i][j]=0;
        
        int[] x= {-1,0,1,0};
        int[] y= {0,-1,0,1};

        int ans = 1;
        for(int k=0;k<4;k++)
        {
            int nx = x[k]+i;
            int ny = y[k]+j;
          
            if(nx>=0 && nx<n && ny>=0 && ny<m  && grid[nx][ny]==1)
            {
               
               ans =ans+ dfs(nx,ny,n,m,grid);
            }
        }
     return ans;
    }
}