class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> st=new Stack<Integer>();
        int i=0;
        int j=0;
        
        while(j<popped.length && i<pushed.length)
        {
            if(st.isEmpty() || st.peek()!=popped[j])
            {
                st.push(pushed[i]);
                i++;
            }
            else 
            {
                st.pop();
                j++;
            }
        }
        
        while(j<popped.length)
        {
            if(st.isEmpty() || st.peek()!=popped[j] )
                return false;
            j++;
            st.pop();
        }
        
        return true;
    }
}