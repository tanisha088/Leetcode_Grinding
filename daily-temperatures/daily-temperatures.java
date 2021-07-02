class Solution {
    public int[] dailyTemperatures(int[] nums) {
        /*
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
        */
          
         Stack<Integer> st = new Stack<Integer>();
       
       int[] res= new int[nums.length];
       for(int i=0;i<nums.length;i++)
       res[i]=0;
       
       for(int i=nums.length-1;i>=0;i--)
       {
         //  if(!st.isEmpty && st.peek()>arr[i])
          //  res[i]=st.peek();
           
           while(!st.isEmpty() && nums[st.peek()]<=nums[i])
           {
           st.pop();
           }           
           
           
           if(!st.isEmpty() && i<nums.length)
             res[i]=st.peek()-i;
           st.push(i);
       }
        
        return res;
    }
}