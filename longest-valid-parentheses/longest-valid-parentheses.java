class Solution {
    public int longestValidParentheses(String s) {
        
        /*
        int l=0;
        int r=0;
        int count=0;
        int max=0;
        for(char c:s.toCharArray())
        {
            if(c=='(')
                l++;
            if(c==')')
                r++;
            if(r>l)
               {
            max=Math.max(count,max);
                l=0;
                r=0;
                count=0;
            }
           else if(r<=l && c==')')
            {
                count+=2;
            }
     //       System.out.println(l+" "+r+" "+c+" "+count);
        }
        
        max=Math.max(count,max);
        
        return max;
        */
        
        
        Stack<Integer> st = new Stack<Integer>();
        int max= 0;
        for(int i=0;i<s.length();i++)
        {
           if(s.charAt(i)=='(' || st.isEmpty())
               st.push(i);
            else if(!st.isEmpty())
            {
                if(s.charAt(st.peek())=='(')
                {
                    st.pop();
                    max=Math.max(i-(st.isEmpty()?-1:st.peek()),max);
                }
                else st.push(i);
            }
        
        }
        
        return max;
}
    
}


