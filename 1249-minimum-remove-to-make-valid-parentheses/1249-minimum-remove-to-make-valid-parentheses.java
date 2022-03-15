class Solution {
    public String minRemoveToMakeValid(String s) {
        
     Stack<Integer> st = new Stack();
        for(int i=0;i<s.length();i++)
        {
            char  c = s.charAt(i);
            if(c>='a' && c<='z')
                continue;
            if(!st.isEmpty() && s.charAt(st.peek())=='(' && c==')')
            {
                  st.pop();
                continue;
            }  
               st.push(i);
        }
        
      //  System.out.println(st);
               StringBuilder bs  = new StringBuilder("");
               
               for(int i=s.length()-1;i>=0;i--)
               {
                   if(!st.isEmpty() && st.peek()==i)
                   {
                       st.pop();
                       continue;
                   }
                   
                   bs.append(s.charAt(i));
               }
               
               return bs.reverse().toString();
        
    }
}