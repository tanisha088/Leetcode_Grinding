class Solution {
    public String removeOccurrences(String s, String part) {
        
        Stack<String> st= new Stack<String>();
        
        HashSet<Character> set = new HashSet<Character>();
        
        
        for(int i=0;i<part.length();i++)
        {
            set.add(part.charAt(i));
        }
        
        for(int i=0;i<s.length();i++)
        {
          
                String m = "";
                if(!st.isEmpty())
                    m = st.peek();
                m=m+s.charAt(i);
                
                
                
                String p1 = "";
                
                if(m.length()>=part.length())
                {
               p1 =  m.substring(m.length()-part.length(),m.length());
                }
                //System.out.println(m+" "+i+" "+p1+"***");
                
                if(p1.length()==part.length() && p1.equals(part))
                {
                    m = m.substring(0,m.length()-part.length());
                   
                }
                
                 st.push(m);
            }
            
      //      System.out.println(st.peek());
    
        
       
        if(st.isEmpty())
            return "";
        return st.peek();
    }
}