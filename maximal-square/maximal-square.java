class Solution {
    public int maximalSquare(char[][] mat) {
        
       int res=0;
        
        
    int[][] matrix=new int[mat.length][mat[0].length];
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                matrix[i][j]= mat[i][j]-'0';
                if(matrix[i][j]==1)
                    res=1;
            }
        }
        
        
        for(int i=1;i<matrix.length;i++)
        {
            for(int j=1;j<matrix[0].length;j++)
            {
                if(matrix[i][j]==0)
                    continue;
               matrix[i][j]=1+Math.min(matrix[i-1][j],Math.min(matrix[i][j-1],matrix[i-1][j-1]));
                
                res=Math.max(res,matrix[i][j]);
             
            }
        }
        
        return res*res;
    }
}