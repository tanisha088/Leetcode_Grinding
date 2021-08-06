class Solution {
    public int numDistinct(String s, String t) {
        int[][] ans = new int[s.length()+1][t.length()+1];
        
        for(int i=0;i<s.length()+1;i++)
            ans[i][0]=1;
        
        for(int i=0;i<t.length()+1;i++)
            ans[0][i]=0;
        
        ans[0][0]=1;
        
        
        for(int i=1;i<s.length()+1;i++)
        {
            for(int j=1;j<t.length()+1;j++)
            {
                if(s.charAt(i-1)==t.charAt(j-1))
                {
                    ans[i][j] = ans[i-1][j]+ans[i-1][j-1];
                }
                else
                {
                    ans[i][j] = ans[i-1][j];
                }
            //    System.out.print(ans[i][j]+"  ");
            }
          //  System.out.println("******");
        }
           return ans[s.length()][t.length()]; 
    }
}