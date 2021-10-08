class Solution {
    public int uniquePathsWithObstacles(int[][] m) {
     
        
        
//         if(obstacleGrid[0][0]==1 || obstacleGrid[obstacleGrid.length-1][obstacleGrid[0].length-1]==1)
//             return 0;
//         for(int i=0;i<obstacleGrid.length;i++)
//         {
//             for(int j=0;j<obstacleGrid[0].length;j++)
//             {
//                 if(i==0 && j==0)
//                 {
//                     obstacleGrid[i][j]=1;
//                     continue;
//                     }
//                         if(obstacleGrid[i][j]==1)
//                 {
//                     obstacleGrid[i][j]=-1;
//                     continue;
//                 }   
                
//                 /*
//                 if(i==0)
//                 {
//                     if(obstacleGrid[i][j-1]!=-1)
//                         obstacleGrid[i][j]=obstacleGrid[i][j-1];
//                 }
                
//                 else if(j==0)
//                 {
//                      if(obstacleGrid[i-1][j]!=-1)
//                         obstacleGrid[i][j]=obstacleGrid[i-1][j];
//                 }
//                 else
//                 {
//                     if(obstacleGrid[i-1][j]!=-1)
//                         obstacleGrid[i][j]+=obstacleGrid[i-1][j];
                    
//                     if(obstacleGrid[i][j-1]!=-1)
//                         obstacleGrid[i][j]+=obstacleGrid[i][j-1];
//                 }
//                 */
                
//    // THE WHOLE ABOVE CONDITION SET CAN BE EASILY REPLACED BY THIS ----------->>>>>>>>
//                     if(i>0)
//                     if(obstacleGrid[i-1][j]!=-1)
//                         obstacleGrid[i][j]+=obstacleGrid[i-1][j];
                    
//                 if(j>0)
//                     if(obstacleGrid[i][j-1]!=-1)
//                         obstacleGrid[i][j]+=obstacleGrid[i][j-1];
                
//             }
//         }
        
//         return obstacleGrid[obstacleGrid.length-1][obstacleGrid[0].length-1];
        
        
//         for(int i=0;i<obstacleGrid.length;i++)
//         {
//             for(int j=0;j<obstacleGrid[0].length;j++)
//             {
//                 if(i==0 && j==0)
//                     obstacleGrid[i][j]=1;
//                else if(i==0 || j==0)
//                 {
//                     if(obstacleGrid[i][j]!=1)
//                         obstacleGrid[i][j]=((i==0)?obstacleGrid[i][j-1]:obstacleGrid[i-1][j]);
//                     else
//                         obstacleGrid[i][j]=0;
//                 }
//                 else
//                 {
//                     if(obstacleGrid[i][j]==1)
//                         obstacleGrid[i][j]=0;
//                     else
//                     obstacleGrid[i][j]=obstacleGrid[i-1][j]+obstacleGrid[i][j-1];
//                 }
//             }
//         }
        
//         return obstacleGrid[obstacleGrid.length-1][obstacleGrid[0].length-1];
        
        if(m[m.length-1][m[0].length-1]==1 || m[0][0]==1)
            return 0;
        
        for(int i=0;i<m.length;i++)
        {
            for(int j=0;j<m[0].length;j++)
            {
                if(m[i][j]==0)
                    m[i][j]=1;
                else
                    m[i][j]=0;
            }
        }
        
        for(int i=1;i<m.length;i++)
        {
            if(m[i][0]==0)
                continue;
            m[i][0]=m[i-1][0];
        }
        
        for(int i=1;i<m[0].length;i++)
        {
             if(m[0][i]==0)
                continue;
            m[0][i] = m[0][i-1];
        }
        
        for(int i=1;i<m.length;i++)
        {
            for(int j=1;j<m[0].length;j++)
            {
                if(m[i][j]==0)
                    continue;
                m[i][j] = m[i-1][j] + m[i][j-1];
            }
        }
        
        return m[m.length-1][m[0].length-1];
        
    }
}