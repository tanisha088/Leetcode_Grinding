class Solution {
    public int calPoints(String[] ops) {
        
        Stack<Integer> st =  new Stack();
        for(String str:ops)
        {
            if(str.equals("C"))
                st.pop();
            else if(str.equals("D"))
                st.push(st.peek()*2);
            else if(str.equals("+"))
            {
                int a  = st.pop();
                int b = st.peek() + a;
                st.push(a);
                st.push(b);
            }
            else
            {
            int val = Integer.parseInt(str);
                st.push(val);
            }
            
    //        System.out.println(st);
        }
        
        int sum = 0;
        
        while(!st.isEmpty())
            sum = sum +  st.pop();
        
        return sum;
    }
}


