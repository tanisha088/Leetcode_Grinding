class Solution {
    public int scoreOfParentheses(String s) {
     
        Stack<String> st =new Stack<String>();
        
        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            
            if(c=='(')
                st.push(c+"");
            else
            {
                if(st.peek().equals("("))
                {
                    st.pop();
                  
                    if(!st.isEmpty() && !st.peek().equals("("))
                    {
                      st.push((Integer.parseInt(st.pop())+1) + "");
                    }
                    else
                        st.push(1+"");
                }
                else
                {
                    int m = Integer.parseInt(st.pop());
                    st.pop();
                   
                    if(!st.isEmpty() && !st.peek().equals("("))
                    {
                      st.push((Integer.parseInt(st.pop())+2*m) + "");
                    }
                    else
                         st.push(2*m+"");
                }
            }
        }
        
        return Integer.parseInt(st.peek());
        
    }
}
/*
(()())(())
score -> 4+2 = 6     4  
*/


