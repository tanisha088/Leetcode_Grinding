class Solution {
    public boolean exist(char[][] board, String word) {
        
       
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
                 HashSet<String> set = new HashSet<String>();
                 
                if(board[i][j]==word.charAt(0))
                {
                    StringBuilder sb =new StringBuilder("");
                    sb.append(word.charAt(0));
                if(dfs(board,word,set,sb,i,j))
                    return true;
          //       System.out.println("**"+" "+i+" "+j);
                }
            }
        }
        
        return false;
    }
    
    public boolean dfs(char[][] board,String word,HashSet<String> set,StringBuilder sb,int i,int j)
    {
       set.add(i+" "+j);
 //       System.out.println(sb);
        if(sb.toString().equals(word))
            return true;
        
        int[] x = {-1,0,1,0};
        int[] y = {0,1,0,-1};
        
        for(int k=0;k<4;k++)
        {
            int nx=x[k]+i;
            int ny=y[k]+j;
               
            int size = sb.length();
            if(nx>=0 && ny>=0 && nx<board.length && ny<board[0].length && !set.contains(nx+" "+ny) && word.charAt(size)==board[nx][ny])
            {
                sb.append(board[nx][ny]);
               boolean k1 = dfs(board,word,set,sb,nx,ny);
                if(k1)
                    return true;
                     sb.delete(sb.length()-1,sb.length());
            }
        }
        
        set.remove(i+" "+j);
        
        return false;
    }
}