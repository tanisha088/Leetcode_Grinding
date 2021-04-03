class Solution {
    public int minAddToMakeValid(String S) {
        
        Stack<Character> st= new Stack<Character>();
        
        for(int i=0;i<S.length();i++)
        {
            if(S.charAt(i)=='(')
                st.push('(');
            else
            {
                if(st.isEmpty() || st.peek()==')')
                    st.push(')');
                else
                    st.pop();
            }
                
        }
        
        return st.size();
    }
}