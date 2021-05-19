class Solution {
    public void solve(char[][] board) {
        
        
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
                if((i==0 || j==0 || i==board.length-1 || j==board[0].length-1) && (board[i][j]=='O'))
                    dfs(i,j,board);
            }
        }
        
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
                if(board[i][j]=='O')
                    board[i][j] = 'X';
            else if(board[i][j]=='V')
                    board[i][j]='O';
           
        }
    }
    
    public void dfs(int i,int j,char[][] grid)
    {
        grid[i][j]='V';
        
            int[] x= {-1,0,1,0};
        int[] y = {0,1,0,-1};
        
        for(int m=0;m<4;m++)
        {
            int nx = x[m]+i;
            int ny = y[m]+j;
            
            if(nx<grid.length && nx>=0 && ny<grid[0].length && ny>=0 && grid[nx][ny]=='O')
            {
                grid[nx][ny]='V';
                dfs(nx,ny,grid);
            }
    }
    }
}