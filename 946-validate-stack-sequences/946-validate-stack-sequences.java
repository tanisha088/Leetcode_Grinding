class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> st=new Stack<Integer>();
        
        
       int i=0;
        int j=0;
        while(i<pushed.length)
        {
           
            while(!st.isEmpty() && j<popped.length && st.peek()==popped[j])
            {
                j++;
                st.pop();
            }   
             int a  = popped[j];
            while(i<pushed.length && pushed[i]!=a)
                st.push(pushed[i++]);
            
            if(i<pushed.length && a==pushed[i])
            {
                i++;
                j++;
            }
                
        }
        
        
        while(j<popped.length)
        {
            if(st.isEmpty() || popped[j]!=st.peek())
                return false;
            
            st.pop();
            j++;
        }
        
        return true;
        
    }
}