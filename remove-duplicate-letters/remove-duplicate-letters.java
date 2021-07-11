class Solution {
    public String removeDuplicateLetters(String s) {
        
        Stack<Integer> st = new Stack<Integer>();
     
        HashSet<Character> h=  new HashSet<Character>();
        int[] arr = new int[26];
        
        for(int i=s.length()-1;i>=0;i--)
        {
      
            arr[s.charAt(i)-'a']+=1;
        }
        
        for(int i=0;i<s.length();i++)
        {
                            arr[s.charAt(i)-'a']-=1;

            if(h.contains(s.charAt(i)))
                continue;
            
            while(!st.isEmpty() && s.charAt(st.peek())>=s.charAt(i) && arr[s.charAt(st.peek())-'a']>0)
            {
                   int m =  st.pop();
                                h.remove(s.charAt(m));
            } 
            
            st.push(i);
                h.add(s.charAt(i));
            
            
//       System.out.println(st+ " " + h+" **");
        }
        
        String ans="";
        
        while(!st.isEmpty())
            ans= s.charAt(st.pop())+ans;
        
        return ans;
    }
}

