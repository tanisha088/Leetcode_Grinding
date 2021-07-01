class Solution {
    public void rotate(int[][] matrix) {
        
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=i+1;j<matrix[0].length;j++)
            {
                int t = matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=t;
            }
        }
        
       
        
        for(int i=0;i<matrix.length;i++)
        {
            int j = matrix[0].length-1;
            int st = 0;
            
            while(st<j)
            {
                int t=matrix[i][j];
                matrix[i][j]=matrix[i][st];
                matrix[i][st]=t;
                st++;
                j--;
            }
        }
        
        
    }
}