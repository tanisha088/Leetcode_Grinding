class Solution {
    public int maxDepth(String s) {
        
        int ans=0;
        
        int count=0;
        
        for(char c:s.toCharArray())
        {
            if(c=='(')
            {
                count++;
                ans=Math.max(count,ans);
            }
            else if(c==')')
                count--;
            
            
        }
        
        return ans;
        
        // ACHA TEST CASE ==>"8*((1*(5+6))*(8/6))" ELSE GALAT PASS HO RHA THA
        
        // or can do without use of stack also-- see thoda neeche jaakar
        /*
        Stack<Character> st= new Stack<Character>();
        int ans=0;
        
        String  str= "";
        for(int i=0;i<s.length();i++)
            if(s.charAt(i)=='(' || s.charAt(i)==')')
                 str=str+s.charAt(i);
   int i=0;
        while(i<str.length())
    {
            int co=0;
        char c = str.charAt(i);
        if(c=='(')
        {
            st.push('(');
            i++;
        }
        else
        {
         while(!st.isEmpty() && i<str.length() && str.charAt(i)==')')
         {
             st.pop();
             i++;
         }
        }
            
            ans = Math.max(ans,st.size());
    }
        
        return ans;
    }
    *//*
        
        int res=0;
        int ans=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            {
                res++;
                ans = Math.max(ans,res);
            }
            else if(s.charAt(i)==')')
                res--;
        }
        return ans;
        
        */
    }
}



/*

(()(( 

2

( ( ( ( ( ( ( ( ) ) ( (   )  ) ( ) ( ( 

*/