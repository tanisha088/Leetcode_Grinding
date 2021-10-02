class Solution {
    public int swimInWater(int[][] grid) {
        
       PriorityQueue<int[]> pq= new PriorityQueue<int[]>((a,b)->(a[2]-b[2]));
        boolean[][] visited= new boolean[grid.length][grid.length];
        pq.add(new int[]{0,0,grid[0][0]});
        while(true)
        {
            int[] arr= pq.remove();
            if(arr[0]==grid.length-1 && arr[1]==grid.length-1)
                 return arr[2];
            
            visited[arr[0]][arr[1]]=true;
            
            int[] x= {-1,0,0,1};
            int[] y={0,-1,1,0};
            for(int i=0;i<4;i++)
            {
                int nx = x[i]+arr[0];
                int ny= y[i]+arr[1];
                if(nx>=0 && nx<grid.length && ny>=0 && ny<grid.length && !visited[nx][ny])
                {
                    pq.add(new int[]{nx,ny,Math.max(arr[2],Math.max(grid[nx][ny],grid[arr[0]][arr[1]]))});
                                    
                 }
            
            }
        }
    }
}