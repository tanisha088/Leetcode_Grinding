class Solution {
    public int countSquares(int[][] matrix) {
        
        for(int i=1;i<matrix.length;i++)
        {
            for(int j=1;j<matrix[0].length;j++)
            {
                if(matrix[i][j]!=0)
                    matrix[i][j]+=Math.min(matrix[i-1][j-1],Math.min(matrix[i-1][j],matrix[i][j-1]));
            }
        }
        
        
        int res=0;
        
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                res+=matrix[i][j];
            }
        }
        
        return res;
    }
}

