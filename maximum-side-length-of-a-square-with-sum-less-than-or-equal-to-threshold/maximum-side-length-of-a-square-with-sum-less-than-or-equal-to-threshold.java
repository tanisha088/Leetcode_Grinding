class Solution {
    public int maxSideLength(int[][] mat, int threshold) {
        
        int[][] sum = new int[mat.length+1][mat[0].length+1];
        
        
        for(int i=1;i<=mat.length;i++)
        {
            for(int j=1;j<=mat[0].length;j++)
            {
                sum[i][j] = sum[i-1][j] + sum[i][j-1] - sum[i-1][j-1] + mat[i-1][j-1];
       //         System.out.println(sum[i][j]);
            }
        }
        
        int l = 1;
        int r = Math.min(mat.length,mat[0].length);
        int res=0;
        while(l<=r)
        {
            int mid = l  + (r-l)/2;
            
            boolean k = ssum(mid,mat,sum,threshold);
            
            if(k)
            {
                res=Math.max(mid,res);
                l = mid+1;
            }
            else
                r = mid-1;
        }
        
        
        return res;
        
    }
    
    public boolean ssum(int mid,int[][] mat,int[][] sum,int threshold)
    {
        int totsum=Integer.MAX_VALUE;
        for(int i=mid;i<sum.length;i++)
        {
            for(int j=mid;j<sum[0].length;j++)
            {
                 totsum = Math.min(totsum,sum[i][j] - sum[i-mid][j] - sum[i][j-mid] + sum[i-mid][j-mid]);
            
            }
        }
        
        
        return totsum<=threshold?true:false;
    }
}

/*

1 1 3 2 4 3 2
1 1 3 2 4 3 2
1 1 3 2 4 3 2




*/