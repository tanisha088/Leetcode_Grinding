class Solution {
    public boolean isValidSudoku(char[][] board) {
        
     //     System.out.println(isvalid(0,0,board[0][0],board));
        
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
                if(board[i][j]=='.')
                    continue;
                if(!validate(board,i,j))
                    return false;
            }
        }
        
        return true;
    }
    
    public boolean validate(char[][] board,int i,int j)
    {
        for(int k=0;k<board[0].length;k++)
        {
            if(k==j)
                continue;
            if(board[i][k]==board[i][j])
                return false;
        }
        
        for(int q=0;q<board.length;q++)
        {
            if(i==0 && j==0)
                System.out.println("** "+q+" "+board[i][j]+" "+board[q][j]);
            if(q==i)
                continue;
            
            if(board[q][j]==board[i][j])
                return false;
        }
        
        int r = (i/3)*3;
        int c = (j/3)*3;
    //    System.out.println(r+" "+c+" "+i+" "+j);
        for(int a=0;a<3;a++)
        {
            for(int b=0;b<3;b++)
            {
                int x = r+a;
                int y = c+b;
                if(x==i && y==j)
                    continue;
                
                if(board[i][j]==board[x][y])
                    return false;
            }
        }
        
        return true;
    }
    
    
    public boolean isvalid(int i,int j,char k,char[][] grid)
    {
        if(k=='.')
            return true;
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