class Solution {
    
    int res=0;
    public int maxAreaOfIsland(int[][] grid) {
      
        int con=0;
        boolean[][] vertices= new boolean[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(vertices[i][j]==false && grid[i][j]==1)
                {
                    res=0;
               dfs(i,j,grid.length,grid[0].length,grid,vertices);
                  con=Math.max(con,res);
                }
            }
        }

        return con;
    }

    public void dfs(int i,int j,int n,int m, int[][] grid,boolean[][] vertices)
    {
        vertices[i][j]=true;
        res++;
        
        int[] x= {-1,0,1,0};
        int[] y= {0,-1,0,1};

        for(int k=0;k<4;k++)
        {
            int nx = x[k]+i;
            int ny = y[k]+j;
          
            if(nx>=0 && nx<n && ny>=0 && ny<m && vertices[nx][ny]==false && grid[nx][ny]==1)
            {
                vertices[nx][ny]=true;
                dfs(nx,ny,n,m,grid,vertices);
            }
        }

    }
}