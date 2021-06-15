class Solution {
    public void solveSudoku(char[][] board) {
        
        solve(board);
    }
    
    public boolean solve(char[][] board)
    {
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
                if(board[i][j]=='.')
                {
                for(char k='1';k<='9';k++)
                {
                    if(isvalid(i,j,k,board))
                    {
                    board[i][j]= k;
                    
                        boolean m1 = solve(board);
                       // System.out.println(board+" "+m1+" "+board[i][j]);
                    if(m1)
                    {
                        return true;
                    }
                    else
                    {
                        board[i][j]='.';
                    }
                    }
                }
                
                  return false;
                }
            }
        }
        
        return true;
      
    }
    
    public boolean isvalid(int i,int j,char k,char[][] grid)
    {
        int smallrow = 3* (i/3);
        int smallcol = 3 * (j/3);
        for(int no=0;no<9;no++)
        {
            if(grid[no][j]==k)
                return false;
            
            if(grid[i][no]==k)
                return false;
            
            if(grid[smallrow+no/3][smallcol+no%3]==k)
                return false;
        }
        
        return true;
    }
}