class Solution {
    public int shortestBridge(int[][] grid) {
        
        boolean[][] visited= new boolean[grid.length][grid[0].length];
LinkedList<int[]> list= new LinkedList<int[]>();
        boolean k=true;
       for(int i=0;i<grid.length;i++)
       {
           for(int j=0;j<grid[0].length;j++)
           {
               if(grid[i][j]==1)
               {
                   dfs(i,j,grid,visited,list);
               //    System.out.println(i+ " "+j);
                   k=false;
                   break;
               }
               
             
           }
             if(k==false) break;
       }
      /*  
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
                System.out.print(grid[i][j]+" ");
            System.out.println();
        }
     */   
        return bfs(visited,grid,list);
    }
    
    public void dfs(int i,int j,int[][] grid,boolean[][] visited,LinkedList<int[]> list)
    {
        visited[i][j]=true;
        grid[i][j]=2;
        list.add(new int[]{i,j});
        int[] x={-1,0,0,1};
        int[] y={0,1,-1,0};
        for(int a=0;a<4;a++)
        {
            int nx=x[a]+i;
            int ny=y[a]+j;
            if(nx>=0 && nx<grid.length && ny>=0 && ny<grid[0].length && !visited[nx][ny] && grid[nx][ny]==1)
            {
                dfs(nx,ny,grid,visited,list);
            }
        }
    }
    
    public int bfs(boolean[][] visited,int[][] grid,LinkedList<int[]> list)
    {
        
     ///   System.out.println(srcx+" "+srcy+" 888888");
        int ans=0;
        while(!list.isEmpty())
        {
            int size = list.size();
            while(size!=0)
            {
                size--;
                int[] cor= list.removeFirst();
                
                int cx = cor[0];
                int cy = cor[1];
        
                if(grid[cx][cy]==1)
                    return ans;
            //    System.out.println(cx+" "+cy+" "+grid[cx][cy]);
         
                        visited[cx][cy]=true;

             int[] x={-1,0,0,1};
        int[] y={0,1,-1,0};
        for(int a=0;a<4;a++)
        {
            int nx=x[a]+cx;
            int ny=y[a]+cy;
            if(nx>=0 && nx<grid.length && ny>=0 && ny<grid[0].length && !visited[nx][ny])
            {
                if(grid[nx][ny]==1)
                    return ans;
              
                
                list.add(new int[]{nx,ny});
                visited[nx][ny]=true;
            }
        
        }
            }
            ans++;
    }
        
        return -1;
}
}