class Solution {
    public void gameOfLife(int[][] board) {
        
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
                int[] x = {-1,-1,-1,0,0,1,1,1};
                int[] y = {1,0,-1,1,-1,1,0,-1};
                int count = 0;
                for(int k=0;k<8;k++)
                {
                    int nx = x[k] + i;
                    int ny = y[k] + j;
                    
                    if(nx>=0 && ny>=0 && nx<board.length && ny<board[0].length)
                    {
                        if(board[nx][ny]==1 || board[nx][ny]==3)
                            count++;
                    }
                }
                
             //   System.out.println(board[i][j]+" "+count);
                if(board[i][j]==1 || board[i][j]==3)
                {
                    if(count<2 || count>3)
                        board[i][j] = 3;
                }
                else
                {
                    if(count==3)
                        board[i][j]=2;
                }
            }
        }
        
        
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
                if(board[i][j]==2)
                    board[i][j]=1;
                else if(board[i][j]==3)
                    board[i][j]=0;
            }
        }
        
      
        
    }
}

