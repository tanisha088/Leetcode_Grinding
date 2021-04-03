class Solution {
    public boolean backspaceCompare(String S, String T) {
        Stack<Character> st= new Stack<Character>();
        
        for(int i=0;i<S.length();i++)
        {
            if(S.charAt(i)=='#')
            {
                if(!st.isEmpty())
                    st.pop();
            }
            else
                st.push(S.charAt(i));
        }
        
        String m = "";
        while(!st.isEmpty())
            m=m+st.pop();
        
         for(int i=0;i<T.length();i++)
        {
            if(T.charAt(i)=='#')
            {
                if(!st.isEmpty())
                    st.pop();
            }
            else
                st.push(T.charAt(i));
        }
        
        String q = "";
        while(!st.isEmpty())
            q= q+st.pop();
        
        return m.equals(q);
    }
}