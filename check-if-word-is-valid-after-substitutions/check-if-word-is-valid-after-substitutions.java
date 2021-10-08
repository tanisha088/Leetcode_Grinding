class Solution {
    public boolean isValid(String s) {
        Stack<Character> st= new Stack();
        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
    //        System.out.println(st);
            if(c=='c')
            {
                if(st.size()<2)
                    return false;
                
                char b  = st.pop();
                char a  = st.pop();
         //       System.out.println(st+" "+i);
                if(b=='b' && a=='a')
                    continue;
                if(a!='a')
                    st.push(a);
                if(b!='b')
                   return false;
                st.push(b);
                st.push('c');
            }
            else 
                st.push(c);
             
        }
        
        
        return st.isEmpty();
    }
}

