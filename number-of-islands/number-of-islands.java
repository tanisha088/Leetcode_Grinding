class Solution {
    public int numIslands(char[][] grid) {
        
        boolean[][] visited= new boolean[grid.length][grid[0].length];
        int ans=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(!visited[i][j] && grid[i][j]=='1')
                {
                    dfs(i,j,grid,visited);
                    ans++;
                }
            }
        }
        
        return ans;
    }
    
    public void dfs(int i,int j,char[][] grid,boolean[][] visited)
    {
        visited[i][j]=true;
        
        int[] x= {-1,0,1,0};
        int[] y = {0,1,0,-1};
        
        for(int m=0;m<4;m++)
        {
            int nx = x[m]+i;
            int ny = y[m]+j;
            
            if(nx<grid.length && nx>=0 && ny<grid[0].length && ny>=0 && visited[nx][ny]==false &&grid[nx][ny]=='1')
            {
                visited[nx][ny]=true;
                dfs(nx,ny,grid,visited);
            }
        }
    }
}