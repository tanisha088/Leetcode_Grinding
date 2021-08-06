class Solution {
    public int longestPalindromeSubseq(String s) {
        
        int[][] res = new int[s.length()][s.length()];
        int max=1;
        for(int gap=0;gap<s.length();gap++)
        {
            for(int i=0;i<s.length()-gap;i++)
            {
                int j =  i+gap;
                
                if(gap==0)
                    res[i][j]=1;
                else if(gap==1)
                {
                    if(s.charAt(i)==s.charAt(j))
                        res[i][j]=2;
                    else
                        res[i][j]=1;
                }
                else
                {
                 
                        if(j>0 && i<s.length()-1)
                            
                       { 
                               if(s.charAt(i)==s.charAt(j))
                    {
                            res[i][j]=Math.max(res[i+1][j-1] +2,res[i][j]);
                      }
                            else
                            {
                                res[i][j]=Math.max(res[i+1][j],res[i][j-1]);
                            }
                       }
                 
                }
                max=Math.max(res[i][j],max);
            }
        }
        
        return max;
    }
}