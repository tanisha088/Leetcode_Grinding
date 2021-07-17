class Solution {
    public boolean parseBoolExpr(String s) {
        
        
        Stack<Character> st = new Stack<Character>();
        
        for(char c :s.toCharArray())
        {
            if(c==')')
            {
                HashSet<Character> set = new HashSet<Character>();
                while(st.peek()!='(')
                    set.add(st.pop());
                
                st.pop();
                
                char  op = st.pop();
                
            char tbi  = (op=='!')?(set.contains('f')?'t':'f'):((op=='&')?((!set.contains('f') &&set.contains('t'))?'t':'f'):(set.contains('t')?'t':'f'));
                             
                st.push(tbi);
            }
            else
            st.push(c);
            
        }
        
        return st.peek()=='t'?true:false;
    }
}