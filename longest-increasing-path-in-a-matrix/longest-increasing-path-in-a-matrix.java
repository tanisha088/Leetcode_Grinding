class Solution {
  
    public int longestIncreasingPath(int[][] matrix) {

       int ans = 0;
        HashMap<String,Integer> h=new HashMap();
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                ans =  Math.max(ans,dfs(i,j,new HashSet<String>(),matrix,0,h));
            }
        }
        
        return ans;
        
    }
    
    public int dfs(int sx,int sy,HashSet<String> set,int[][] matrix,int res,HashMap<String,Integer> h)
    {
        
        if(h.containsKey(sx+" "+sy))
            return h.get(sx+" "+sy);
        
        set.add(sx+" "+sy);
        
        int[] x ={-1,0,0,1};
        int[] y ={0,1,-1,0};
        int a1 =0;
        for(int i=0;i<4;i++)
        {
            int nx= x[i]+sx;
            int ny = y[i]+sy;
            
            if(nx>=0 && ny>=0 && nx<matrix.length && ny<matrix[0].length && !set.contains(nx+" "+ny) && matrix[nx][ny]>matrix[sx][sy])
            {
        
                int m  =  dfs(nx,ny,set,matrix,res+1,h);
                a1=Math.max(m,a1);
            }
            
        }
        
        set.remove(sx+" "+sy);
        h.put(sx+" "+sy,a1+1);
        return a1+1;
    }
}










/*


*/