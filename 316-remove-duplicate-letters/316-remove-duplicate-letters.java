class Solution {
    public String removeDuplicateLetters(String s) {
        
       Stack<Character> st=  new Stack<Character>();
       HashSet<Character> set=  new HashSet();
       HashMap<Character,Integer> map =  new HashMap();
        
        for(char c:s.toCharArray())
            map.put(c,map.getOrDefault(c,0)+1);
        
        for(char c:s.toCharArray())
        { 
            map.put(c,map.get(c)-1);
            if(set.contains(c))
                continue;
            while(!st.isEmpty() && st.peek()>c && map.get(st.peek())>0)
            {
               char a = st.pop();
                set.remove(a);
           //     System.out.println("c--"+" "+a+" "+set);
            }
            
            st.push(c);     
            set.add(c);
   //    System.out.println(c+"-->"+st+" "+set);

        }
        
        StringBuilder sb = new StringBuilder("");
        
        while(!st.isEmpty())
            sb.append(st.pop());
        
        return sb.reverse().toString();
        
    }
}

