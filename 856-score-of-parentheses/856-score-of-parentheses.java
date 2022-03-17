class Solution {
   
    public int scoreOfParentheses(String s) {
  
          int score = 0;
          int left = 0;
        
          int i=0;
        
        while(i<s.length())
        {
            while(i<s.length() && s.charAt(i)=='(')
            {
                i++;
                left++;
            }
            int max = left;
            
            while(i<s.length() && s.charAt(i)==')')
            {
                i++;
                left--;
            }
            score+= (int)Math.pow(2,max-1);
        }
        
        return score;
        
    }
}

