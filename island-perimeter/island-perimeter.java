class Solution {
    public int islandPerimeter(int[][] grid) {
     int ans=0;
        
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]==1)
                {
                    int counter=4;
                    int[] x=  {-1,0,1,0};
                    int[] y= {0,1,0,-1};
                    
                    for(int k=0;k<4;k++)
                    {
                        int nx = x[k]+i;
                        int ny = y[k]+j;
                        
                        if(nx>=0 && ny>=0 && nx<grid.length && ny<grid[0].length && grid[nx][ny]==1)
                             counter--;
                    }
                    
                    ans+=counter;
                }
            }
        }
        
        
        return ans;
    }
}