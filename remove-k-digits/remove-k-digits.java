class Solution {
    public String removeKdigits(String num, int k) {
        
        char[] nums = num.toCharArray();
        Stack<Integer> st = new Stack<Integer>();

        for(int i=0;i<nums.length;i++)
        {
            
                while(!st.isEmpty() && st.peek()>nums[i]-'0' && k>0)
                {
                    st.pop();
                    k--;
                }
            
            st.push(nums[i]-'0');
        }
        
        
        while(!st.isEmpty() && k>0)
        {
            st.pop();
            k--;
        }
       
        String res = "";
        while(!st.isEmpty())
            res= st.pop()+res;
        
        int j=0;
        while(j<res.length() && res.charAt(j)=='0')
            j++;
        
        
        
        return res.substring(j,res.length()).length()==0?"0":res.substring(j,res.length());
        
    }
}



/*
0=> nod > better place value  remove all >place and 0 .

4 6 7 2 9
*/