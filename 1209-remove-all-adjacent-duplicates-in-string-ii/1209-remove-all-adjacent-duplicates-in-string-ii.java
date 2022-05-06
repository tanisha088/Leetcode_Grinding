class Solution {
   
    public String removeDuplicates(String s, int k) {
        
        Stack<int[]> st =  new Stack<int[]>();
         Stack<Character> st1 =  new Stack<Character>();
        
        for(char c:s.toCharArray())
        {
            int[] arr = new int[26];
            
            arr[c-'a']=1;
            if(st.size()>0)
            arr[c-'a'] = arr[c-'a'] + st.peek()[c-'a'];
            
            if(arr[c-'a']==k)
            {
                int j = 1;
                while(j<k)
                {
                    st.pop();
                    st1.pop();
                    j++;
                }
            }
            else
            {
                st.push(arr);
                st1.push(c);
            }
            
        //    System.out.println(st1);
        }
        
        StringBuilder sb =  new StringBuilder("");
        while(!st1.isEmpty())
        {
            sb.append(st1.pop());
        }
        
        return sb.reverse().toString();
        
    }
}