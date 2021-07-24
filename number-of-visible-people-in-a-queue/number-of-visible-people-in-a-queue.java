class Solution {
    public int[] canSeePersonsCount(int[] heights) {
        Stack<Integer> st = new Stack<Integer>();
        int[] res= new int[heights.length];
        for(int i=0;i<heights.length;i++)
        {
           while(!st.isEmpty() && heights[i]>=heights[st.peek()])
           {
               res[st.pop()]+=1;
           }
            
            if(!st.isEmpty())
            res[st.peek()]+=1;
            
            st.push(i);
        }
        
        return res;
    }
}