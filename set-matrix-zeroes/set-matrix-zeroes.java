class Solution {
    public void setZeroes(int[][] matrix) {
        int r=0;
        int c=0;
        
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(i==0 || j==0)
                {
                    if(matrix[i][j]==0 && i==0)
                        c++;
                    if(matrix[i][j]==0 && j==0)
                        r++;
                }
                else
                {
                    if(matrix[i][j]==0)
                    {
                        matrix[i][0]=0;
                        matrix[0][j]=0;
                    }
                }
                    
            }
        }
        
        
        for(int i=1;i<matrix.length;i++)
        {
            if(matrix[i][0]==0)
            {
                for(int j=0;j<matrix[0].length;j++)
                {
                    matrix[i][j]=0;
                }
            }
        }
        
        
        for(int j=1;j<matrix[0].length;j++)
        {
            if(matrix[0][j]==0)
            {
                for(int i=0;i<matrix.length;i++)
                {
                    matrix[i][j]=0;
                }
            }
        }
        
        if(r!=0)
        {
            for(int i=0;i<matrix.length;i++)
                matrix[i][0]=0;
        }
        
        if(c!=0)
        {
            for(int i=0;i<matrix[0].length;i++)
                matrix[0][i]=0;
        }
        
       
    }
}