class Solution {
    public int mctFromLeafValues(int[] arr) {
        
        Stack<Integer> st = new Stack<Integer>();
        int res=0;
        for(int i=0;i<arr.length;i++)
        {
           while(!st.isEmpty() && st.peek()<arr[i])
                {
                    int j = st.pop();
                    int val =  st.isEmpty()?Integer.MAX_VALUE:st.peek();
                    res=res+ Math.min(val,arr[i])*j;
                }
                
                st.push(arr[i]);
        }
        
        while(!st.isEmpty())
        {
            int j = st.pop();
            if(st.isEmpty())
                break;
                    res=res+ st.peek()*j;
        }
        
        return res;
    }
}


/*

       A
      /

*/