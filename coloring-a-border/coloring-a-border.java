class Solution {
    public int[][] colorBorder(int[][] image, int sr, int sc, int color) {
        
          boolean[][] visited= new boolean[image.length][image[0].length];
        dfs(sr,sc,color,image,visited,image[sr][sc]);
        
        return image;
    }
    
    
    public void dfs(int sr,int sc,int newcolor, int[][] image,boolean[][] visited,int val)
    {
        visited[sr][sc] = true;
        
        int[] x= {-1,0,1,0};
        int[] y= {0,1,0,-1};
        
        int count=0;
        
        for(int i=0;i<4;i++)
        {
            int nx= x[i]+sr;
            int ny= y[i]+sc;
            
            if(nx>=0 && ny>=0 && nx<image.length && ny<image[0].length)
            {
                   if(!visited[nx][ny] && image[nx][ny]!=val)
                       count++;
                   
                   if(!visited[nx][ny] && image[nx][ny]==val)
                    dfs(nx,ny,newcolor,image,visited,val);
                
            }
            
        }
//System.out.println(sr+" "+sc+" "+count);        
        if(count!=0 || (sr==0 || sc==0 || sr==image.length-1 || sc==image[0].length-1))
        {
            image[sr][sc]=newcolor;
        }
    } 
        
//         visited[sr][sc]=true;    
//         int[] x={-1,0,0,1};
//         int[] y={0,-1,1,0}; 
//          if(sr==0 || sr==image.length-1 || sc==0 || sc==image[0].length-1)
//              image[sr][sc]=newcolor; 
//              for(int i=0;i<4;i++)
//         {
//             int nx=x[i]+sr;
//             int ny=y[i]+sc;
            
//                  if(nx>=0 && nx<image.length && ny>=0 && ny<image[0].length && image[nx][ny]!=val && !visited[nx][ny])
//                      image[sr][sc]=newcolor;
//         }
        
//         for(int i=0;i<4;i++)
//         {
//             int nx=x[i]+sr;
//             int ny=y[i]+sc;
            
//             if(nx>=0 && nx<image.length && ny>=0 && ny<image[0].length && visited[nx][ny]==false && image[nx][ny]==val)
//                 dfs(nx,ny,newcolor,image,visited,val);
//         }
//     }
        //   visited[sr][sc]=true;
        
        
        
//         int[] x={-1,0,0,1};
//         int[] y={0,-1,1,0};
        
//          if(sr==0 || sr==image.length-1 || sc==0 || sc==image[0].length-1)
//              image[sr][sc]=newcolor;
        
//              for(int i=0;i<4;i++)
//         {
//             int nx=x[i]+sr;
//             int ny=y[i]+sc;
            
//                  if(nx>=0 && nx<image.length && ny>=0 && ny<image[0].length && image[nx][ny]!=val && !visited[nx][ny])
//                      image[sr][sc]=newcolor;
//         }
        
//         for(int i=0;i<4;i++)
//         {
//             int nx=x[i]+sr;
//             int ny=y[i]+sc;
            
//             if(nx>=0 && nx<image.length && ny>=0 && ny<image[0].length && visited[nx][ny]==false && image[nx][ny]==val)
//                 dfs(nx,ny,newcolor,image,visited,val);
//         }
        
        
        
   // }
}