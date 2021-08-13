class Solution {
    public int minimumEffortPath(int[][] heights) {
        
         PriorityQueue<int[]> pq = new PriorityQueue<int[]>((a,b)->(a[2]-b[2]));
        
        HashSet<String> set = new HashSet<String>();
        
        pq.add(new int[]{0,0,0});
        
        while(!pq.isEmpty())
        {
           int[] arr = pq.remove();
            
            int cx = arr[0];
            int cy= arr[1];
            
            if(cx==heights.length-1 && cy ==heights[0].length-1)
                return arr[2];
            
              set.add(cx+" "+cy);
            
            int val  = heights[cx][cy];
            
            int[] x= {-1,0,1,0};
            int[] y={ 0,-1,0,1};
            
            for(int i=0;i<4;i++)
            {
                int nx= x[i]+cx;
                int ny= y[i]+cy;
                
                if(nx>=0 && ny>=0 && nx<heights.length && ny<heights[0].length && !set.contains(nx+" "+ny))
                {
                    int diff = Math.max(Math.abs(heights[nx][ny]-val),arr[2]);
                    
                    pq.add(new int[]{nx,ny,diff});
                }
            }
        }
        
        return -1;
    }
}

/*  




*/