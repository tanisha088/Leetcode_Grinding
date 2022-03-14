class Solution {
    public boolean isValid(String s) {
        
       HashMap<Character,Character> h = new HashMap();
        
        h.put(')','(');
        h.put('}','{');
        h.put(']','[');
        h.put('(',')');
        h.put('{','}');
        h.put('[',']');
    
        Stack<Character> st = new Stack();
        
        for(char c:s.toCharArray())
        {
            
            if(!st.isEmpty() && (c==')' || c=='}' || c==']'))
            {
                char d =  h.get(c);
                if(st.peek()!=d)
                    return false;
                st.pop();
            }
            else
                st.push(c);
                
        }
        
        return st.isEmpty()?true:false;
    }
}




//  open -> push
// closed --> st->empty || the top isn't corresponding -> return false else pop