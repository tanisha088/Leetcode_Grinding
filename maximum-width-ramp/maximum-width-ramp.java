class Solution {
    public int maxWidthRamp(int[] nums) {
        
        Stack<Integer> st = new Stack<Integer>();
        for(int i=0;i<nums.length;i++)
        {
            if(st.isEmpty() || (nums[i]<nums[st.peek()]))
            st.push(i);
        }
               
               
        int ans= 0;
               
               for(int i=nums.length-1;i>=0;i--)
               {
                   if(st.isEmpty())
                       break;
                   
                   while(!st.isEmpty() && nums[i]>=nums[st.peek()])
                       ans = Math.max(ans,i-st.pop());
                   
               }
        
               return ans;
    }
}


/*

6,0,8,2,1,5   

6 0 

*/