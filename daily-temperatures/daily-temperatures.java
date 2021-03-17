class Solution {
    public int[] dailyTemperatures(int[] nums2) {
         int[] result = new int[nums2.length];
        Stack<Integer> st= new Stack<Integer>();
        for(int i=nums2.length-1;i>=0;i--)
        {
            if(st.isEmpty())
            {
                result[i]=0;
                st.push(i);
            }
            else
            {
                if(nums2[st.peek()]>nums2[i])
                {
                    result[i]= st.peek()-i;
                    st.push(i);
                }
                else
                {
                    
                    // DHYAN RAKHNA 
                    while(!st.isEmpty() && nums2[st.peek()]<=nums2[i])
                    st.pop();
                    
                    if(!st.isEmpty())
                        result[i]= st.peek()-i;
                    else
                        result[i]=0;
                        st.push(i);
                }
            }
            
        }
        
        return result;
        
    }
}