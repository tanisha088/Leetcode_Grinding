class Solution {
    
  
    
    public int numTrees(int n) {
        
        long[][] fact = new long[40][40];
        for(int i=1;i<fact.length;i++)
        {
            fact[i][0]=1;
        }
            fact[0][1]=1;
        
        for(int i=1;i<fact.length;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if(i==j)
                    fact[i][j]=1;
                else
                fact[i][j] = fact[i-1][j-1] + fact[i-1][j];
            }
        }
        
        
     //   System.out.println(fact[2*n]+" "+fact[n]);
        
      //  return //(int)((((fact[2*n])/(fact[n]))/fact[n])/(n+1));
        
        return (int)(fact[2*n][n]/(n+1));
    }
    
    
   // ncr = n-1cr + n-1cr-1 
 
    
}