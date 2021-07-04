class Solution {
    public int[] mostCompetitive(int[] nums, int k) {
        
        Stack<Integer> st = new Stack<Integer>();
        for(int i=0;i<nums.length;i++)
        {
            if(st.isEmpty())
                st.push(nums[i]);
            else 
            {
                while(!st.isEmpty() && st.peek()>nums[i])
                {
                    if(k-st.size()<=nums.length-i-1)
                        st.pop();
                    else
                        break;
                }
                
                if(st.size()<k)
                st.push(nums[i]);
            }
        }
        int[] res= new int[k];
        int i=k-1;
        while(!st.isEmpty())
        {
            res[i]=st.pop();
            i--;
        }
        
        return res;
    }
}



/*

3 5 2 6 

2 3 3 4  -> st=1+1 

*/