class Solution {
    public int minInsertions(String s) {
        Stack<Character> st = new Stack<Character>();
        int i=0;
        int count=0;
        while(i<s.length())
        {
            char c=s.charAt(i);
            if(c=='(')
            {
                st.push(c);
                i++;
                continue;
            }
           if(!st.isEmpty() && c==')' && st.peek()=='(')
           {
                   if(i<s.length()-1 && s.charAt(i+1)==')')
                   {
                       st.pop();
                       i+=1;
                   }
                   else
                   {
                       count++;
                       st.pop();
                   }
               
           }
            else
            {
                if(i<s.length()-1 && s.charAt(i+1)==')')
                {
                    i++;
                    count+=1;
                }
                else
                    count+=2;
            }
            
            i++;
         //   System.out.println(st +" "+count+" "+i);
        }
        /*
        while(!st.isEmpty())
        {
            char c =st.pop();
            if(c=='(')
                count+=2;
            else 
            {
                if(!st.isEmpty() && st.peek()==')')
                {
                    count+=1;
                    st.pop();
                }
                else
                {
                    count+=2;
                }
            }
        }
        */
        
        return count+ st.size()*2;
    }
}


