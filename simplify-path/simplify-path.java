class Solution {
    public String simplifyPath(String path) {
        
        Stack<Character> st = new Stack();
        if(path.charAt(0)!='/')
            path='/'+path;
        for(int i=0;i<path.length();)
        {
            char c = path.charAt(i);
            
            if(c=='/')
            {
                if(st.isEmpty() || st.peek()!=c)
                    st.push(c);
                
                i++;
            }
            else if(c=='.')
            {
                StringBuilder sb =   new StringBuilder("");
                while(i<path.length() && path.charAt(i)!='/')
                    sb.append(path.charAt(i++));
                
                if(sb.toString().equals("."))
                     continue;
                else if(sb.toString().equals(".."))
                {
                if(st.size()>1)
                {
                    st.pop();
                   while(!st.isEmpty() && st.peek()!='/')
                       st.pop();
                    
                }
                }
                else
                {
                    for(int j=0;j<sb.length();j++)
                        st.push(sb.charAt(j));
                }
            }
            else
            {
                while(i<path.length() && path.charAt(i)!='/')
                    st.push(path.charAt(i++));
             
            }
        }
        
        StringBuilder sb=  new StringBuilder("");
        if(st.size()>1 && st.peek()=='/')
            st.pop();
        while(!st.isEmpty())
        {
            sb.insert(0,st.pop());
        }
        
        
        return sb.toString();
    }
}

//        


