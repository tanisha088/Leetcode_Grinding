class Solution {
    public int maxDistance(int[][] grid) {
        
        LinkedList<int[]> list= new LinkedList<int[]>();
                HashSet<String> set= new HashSet<String>();

        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]==1)
                {
                    list.add(new int[]{i,j});
                    set.add(i+" "+j);
                }
            }
        }
        
      // *************************** set.add(2+" "+3);
       // NEVER DO THIS ---> HASHSET<INT[]> HASH = NEW HASHSET<INT[]>(); 
     // *********************************  System.out.println(set.contains(2+" "+3));
        
        
        int zero=0;
        int ans=0;
        while(!list.isEmpty())
        {
            int size=list.size();
            while(size!=0)
            {
                int[] arr= list.remove();
            //    System.out.println(arr[0]+" "+arr[1]+" "+ans);
                int x= arr[0];
                int y=arr[1];
                if(grid[x][y]==0)
                    zero=Math.max(ans,zero);
                int[] xc = {-1,0,0,1};
                int[] yc = {0,-1,1,0};
                
                for(int i=0;i<4;i++)
                {
                    int nx= xc[i]+x;
                    int ny = yc[i]+y;
                    if(nx>=0 && nx<grid.length &&ny>=0 && ny<grid[0].length && !set.contains(nx+" "+ny))
                    {
                   
                     //   System.out.println("************");
                        
                     //   System.out.println(nx+" "+ny);
                        list.add(new int[]{nx,ny});
                        set.add(nx+" "+ny);
                    }
                }
                size--;
            }
            ans++;
        }
        zero= (zero==0?-1:zero);
        return zero;
      
    }
}