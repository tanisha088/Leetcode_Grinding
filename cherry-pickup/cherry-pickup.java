class Solution {
    
    int ans;
    public int cherryPickup(int[][] grid) {
        
        HashSet<String> set =  new HashSet();
        int n = grid.length;
        Integer[][][] dp = new Integer[n][n][n];
   
        dfs(0,0,0,0,n-1,n-1,n-1,n-1,set,grid,dp);
        
        return Math.max(dp[0][0][0],0);
        
    }
    
    public int dfs(int fx,int fy,int sx,int sy,int dfx,int dfy,int dsx,int dsy,HashSet<String> set,int[][] grid,Integer[][][] dp)
    {
        
        if(fx>=grid.length || fy>=grid[0].length || sx>=grid.length || sy>=grid[0].length || grid[fx][fy]==-1 || grid[sx][sy]==-1)
        {
            return Integer.MIN_VALUE;
            
        }
        
           if(dp[fx][fy][sx]!=null)
               return dp[fx][fy][sx];
        
        
        if(fx==dfx && fy==dfy && sx==dsx && sy==dsy)
        {
             dp[fx][fy][sx] =  new Integer(grid[fx][fy]);
            return dp[fx][fy][sx];
        }
        int res =0;
        
        res= (grid[fx][fy]);
        
     //    grid[fx][fy]= (grid[fx][fy]==0?0:grid[fx][fy]-1);
        
        if(!(fx==sx && fy==sy))
        {
        res += (grid[sx][sy]);
        }
        
      //  grid[sx][sy] = (grid[sx][sy]==0?0:grid[sx][sy]-1);
        
        // set.add(fx+" "+fy);
        // set.contains(sx+ " "+sy);
        
        int a  =  dfs(fx+1,fy,sx+1,sy,dfx,dfy,dsx,dsy,set,grid,dp);
        
         int b  =  dfs(fx,fy+1,sx+1,sy,dfx,dfy,dsx,dsy,set,grid,dp);
         int c  =  dfs(fx+1,fy,sx,sy+1,dfx,dfy,dsx,dsy,set,grid,dp);
         int d  =  dfs(fx,fy+1,sx,sy+1,dfx,dfy,dsx,dsy,set,grid,dp);
        
        
    //    System.out.println(a+" "+b+" "+c+" "+d+" "+fx+" "+fy+" "+sx+" "+sy);
        
        res += Math.max(a,Math.max(b,Math.max(c,d)));
        dp[fx][fy][sx] = new Integer(res);
     //   System.out.println(res);
        return res;
    }
}

/*

0-empty
1-cherry
-1 - blocks

0,0  ->  n-1,n-1  r,d
n-1,n-1 -> 0,0   l,u

r,d
d,r
r,r
d,d


fx,fy,sx,sy,r,d

*/