class Solution {
    public String minRemoveToMakeValid(String s) {
        
        Stack<Integer> st= new Stack<Integer>();
        for(int i=0;i<s.length();i++)
        {
            char c =s.charAt(i);
            if(c!='(' && c!=')')
                continue;
            if(c=='(' || st.isEmpty())
                st.push(i);
            else
            {
                if(s.charAt(st.peek())=='(')
                {
                    st.pop();
                }
                else
                    st.push(i);
            }
        }
        
        String str = "";
    //    System.out.println(st);
        for(int i=s.length()-1;i>=0;i--)
        {
            if(!st.isEmpty() && st.peek()==i)
                st.pop();
            else
                str = s.charAt(i)+str; 
        }
        
        return str;
        
    }
}