class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums2.length];
        Stack<Integer> st= new Stack<Integer>();
        HashMap<Integer,Integer> h= new HashMap<Integer,Integer>();
        for(int i=nums2.length-1;i>=0;i--)
        {
            if(st.isEmpty())
            {
                h.put(nums2[i],-1);
                st.push(nums2[i]);
            }
            else
            {
                if(st.peek()>nums2[i])
                {
                    h.put(nums2[i],st.peek());
                    st.push(nums2[i]);
                }
                else
                {
                    while(!st.isEmpty() && st.peek()<nums2[i])
                    st.pop();
                    
                    if(!st.isEmpty())
                        h.put(nums2[i],st.peek());
                    else
                        h.put(nums2[i],-1);
                        st.push(nums2[i]);
                }
            }
            
        }
        
        for(int i=0;i<nums1.length;i++)
        {
        //    System.out.println(nums1[i]);
         nums1[i] = h.get(nums1[i]);   
        }
        
        return nums1;
    }
}