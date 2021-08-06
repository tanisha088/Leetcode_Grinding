class Solution {
    public int longestPalindrome(String word1, String word2) {
        return longestPalindromeSubseq(word1+word2,word1.length(),word2.length());
    }
    
    public int longestPalindromeSubseq(String s,int a,int b) {
        
        int[][] res = new int[s.length()][s.length()];
        int max=0;
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
                    {
                        res[i][j]=2;
                        if(i<a && j>=a)
                            max=Math.max(max,res[i][j]);
                    }
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
                                   if(i<a && j>=a)
                            max=Math.max(max,res[i][j]);
                      }
                            else
                            {
                                res[i][j]=Math.max(res[i+1][j],res[i][j-1]);
                            }
                       }
                 
                }
            }
        }
        
        return max;
    }
}