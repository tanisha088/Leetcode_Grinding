class Solution {
    public int islandPerimeter(int[][] grid) {
        
        int res=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]==0)
                    continue;
               int[] x= {-1,0,0,1};
               int[] y= {0,1,-1,0};
               int co=4;
                for(int k=0;k<4;k++)
                {
                    int a = x[k]+i;
                    int b = y[k]+j;
                    
                    if(a>=0 && a<grid.length && b>=0 && b<grid[0].length && grid[a][b]==1)
                        co--;
                }
                
                res+=co;
            }
        }
        
        return res;
    }
}