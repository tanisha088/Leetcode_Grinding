class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        
        boolean[][] visited= new boolean[image.length][image[0].length];
        dfs(sr,sc,newColor,image,visited,image[sr][sc]);
        
        return image;
    }
    
    
    public void dfs(int sr,int sc,int newcolor, int[][] image,boolean[][] visited,int val)
    {
        image[sr][sc]=newcolor;
        visited[sr][sc]=true;
        
        int[] x={-1,0,0,1};
        int[] y={0,-1,1,0};
        
        for(int i=0;i<4;i++)
        {
            int nx=x[i]+sr;
            int ny=y[i]+sc;
            
            if(nx>=0 && nx<image.length && ny>=0 && ny<image[0].length && visited[nx][ny]==false && image[nx][ny]==val)
                dfs(nx,ny,newcolor,image,visited,val);
        }
    }
}