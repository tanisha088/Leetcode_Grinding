class Solution {
    public int orangesRotting(int[][] grid) {
        
        LinkedList<int[]> list = new LinkedList<int[]>();
        HashSet<String> set=new HashSet<String>();
        int  rotten=0;
        int fresh=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]==0)
                    continue;
                if(grid[i][j]==2)
                {
                    list.add(new int[]{i,j});
                    set.add(i+" "+j);
                    rotten++;
                 }
                else
                   fresh++;
               
            }
        }
        int ans=0;
   
          int coo=  rotten+fresh;
          
        if(fresh==0)
            return 0;
        
        if(rotten==0)
            return -1; 
      
      
        while(!list.isEmpty())
        {
            int size=list.size();
            while(size!=0)
            {
                size--;
                
                int[] arr= list.remove();
                coo--;
                int xc=arr[0];
                int yc= arr[1];
                
                int[] x= {-1,0,0,1};
                int[] y= {0,1,-1,0};
                
                for(int i=0;i<4;i++)
                {
                    int nx = x[i]+xc;
                    int ny = y[i]+yc;
                    
                    if(nx>=0 && nx<grid.length && ny>=0 && ny<grid[0].length &&!set.contains(nx+" "+ny) && (grid[nx][ny]==1))
                    {
                        set.add(nx+" "+ny);
                        list.add(new int[]{nx,ny});
                    }
                }
            }
            ans++;
        }
        if(coo!=0)
            return -1;
      return ans-1;
     
    }
    
    
}