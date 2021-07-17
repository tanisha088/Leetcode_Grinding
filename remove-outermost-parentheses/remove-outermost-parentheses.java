class Solution {
    public String removeOuterParentheses(String s) {
        int op=0;
        
        String str = "";
        String s1 = "";
        for(char c:s.toCharArray())
        {
            
            if(c=='(')
            {
               if(op!=0)
            s1 = s1 + '(';
              op++;
            }
            else
            {
                op--;
                if(op==0)
                {
                    str= str + s1;
                    s1="";
                }
                else
                    s1=s1+')';
                    
            }
        }
        
        return str;
    }
}
/*
op = 0
    s1 =  
    str = ()()
*/