class Solution {
    public int trapRainWater(int[][] heightMap) {

        
        
        PriorityQueue<int[]> pq  = new PriorityQueue<int[]>((a,b)->(heightMap[a[0]][a[1]]-heightMap[b[0]][b[1]]));
        
        HashSet<String> visited  = new HashSet<String>();
        
        for(int i=0;i<heightMap.length;i++)
        {
            for(int j=0;j<heightMap[0].length;j++)
            {
                if(i==0 || j==0 || i==heightMap.length-1 || j==heightMap[0].length-1)
                {
                    pq.add(new int[]{i,j});
                    visited.add(i+" "+j);
                }
            }
        }
        int res=0;
        while(!pq.isEmpty())
        {
            int[] cor=  pq.remove();
            //            System.out.println(cor[0]+" "+cor[1]+" "+res);

            int val = heightMap[cor[0]][cor[1]];
            int[] x= {-1,0,1,0};
            int[] y= {0,-1,0,1};
            
            for(int j=0;j<4;j++)
            {
                int nx = cor[0]+x[j];
                int ny = cor[1]+y[j];
                if(nx>=0 && ny>=0 && nx<heightMap.length && ny<heightMap[0].length && !visited.contains(nx+" "+ny))
                {
                    res = res + Math.max(0,heightMap[cor[0]][cor[1]]-heightMap[nx][ny]);
                    
               //     System.out.println("***********");
                    heightMap[nx][ny] = Math.max(heightMap[cor[0]][cor[1]],heightMap[nx][ny]);
                    
                    pq.add(new int[]{nx,ny});
                    visited.add(nx+" "+ny);
              
                }
                
            }
        }
        
        return res;
    }
}