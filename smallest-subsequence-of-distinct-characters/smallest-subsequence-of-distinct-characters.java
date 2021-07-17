class Solution {
    public String smallestSubsequence(String s) {
        
        
        
        /*  WRONG LOGIC """""""""""""""""""""">>>>>>>>>>>>>
        
        HashSet<Character> set = new HashSet<Character>();
        for(int i=0;i<s.length();i++)
            set.add(s.charAt(i));
        
        HashMap<Character,Integer> h= new HashMap<Character,Integer>();
        
        int st=0;
        int end=-1;
        int as=-1;
        int ae=-1;
        while(h.size()!=set.size() && end<s.length())
        {
            end++;
            h.put(s.charAt(end),h.getOrDefault(s.charAt(end),0)+1);
        }

        int ans = end-st+1;
        as=st;
        ae=end;
        boolean k=false;
        System.out.println(st+" "+end);
        while(end<s.length()-1)
        {
            if(k)
            {
            end+=1;
                if(end<s.length())
            h.put(s.charAt(end),h.getOrDefault(s.charAt(end),0)+1);
            }
            while(st<s.length() && st<=end)
            {
                if(h.get(s.charAt(st))<=1)
                    break;
                h.put(s.charAt(st),h.get(s.charAt(st))-1);
                st++;
            }
            
            if(end-st+1 < ans)
            {
                as=st;
                ae=end;
                ans = end-st+1;
            }
           k=true;  
        }
        end=Math.min(end,s.length()-1);
        return s.substring(st,end+1);
        
        */
        
        Stack<Character> st = new Stack<Character>();
        HashSet<Character> set = new HashSet<Character>();
        HashMap<Character,Integer> h = new HashMap();
        
        for(char c:s.toCharArray())
        {
            h.put(c,h.getOrDefault(c,0)+1);
        }
        
        for(char c:s.toCharArray())
        {
           
       while(!st.isEmpty() && st.peek()-'a'>c-'a' && h.get(st.peek())>0 && !set.contains(c))
                {
                    char m = st.pop();
                    set.remove(m);
                }
           
            if(!set.contains(c))
            st.push(c);
            set.add(c);
            h.put(c,h.getOrDefault(c,0)-1);
            
        }
        
        String str = "";
        
        while(!st.isEmpty())
            str = st.pop()+ str;
        
        return str;
    }
}

//aabbccaacabc


/*************************************************************************************/



