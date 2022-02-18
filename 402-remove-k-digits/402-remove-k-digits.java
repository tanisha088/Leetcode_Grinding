class Solution {
    public String removeKdigits(String num, int k) {
        
     StringBuilder sb  = new StringBuilder("");
        if(k>=num.length())
            return  "0";
        int i=0;
        
        for(;i<num.length();i++)
        {
            if(num.charAt(i)=='0')
            {
                k-=i;
                break;
            }
            if(i==k)
                break;
        }
        
        if(num.charAt(i)!='0')
            i = 0;
            
        
        while(i<num.length())
        {
            if(num.charAt(i)!='0')
                break;
            i++;
        }
        
       // System.out.println(i+" "+k);
      
    Stack<Character> st =  new Stack();
        for(int j=i;j<num.length();j++)
        {
            while(!st.isEmpty() && st.peek()>num.charAt(j) && k>0)
            {
                st.pop();
                k--;
            }
            
            st.push(num.charAt(j));
        }
            
    while(!st.isEmpty())
        sb.append(st.pop());
        
      System.out.println(sb);
        
    int j = sb.length()-1;
        while(j>=0)
        {
            if(sb.charAt(j)!='0')
                break;
            
            j--;
        }
    sb = sb.reverse();
        num =  sb.toString();
        num = num.substring(num.length()-1-j,num.length());
        if(num.length()==0)
            return "0";
        
        if(k>=num.length())
            return "0";
        
        return num.substring(0,num.length()-k);
        
        
    }
}


/*

1432219 -->> 2000100234

*/