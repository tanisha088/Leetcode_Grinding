class Solution {
    public int[] nextGreaterElements(int[] nums) {
        
        int[] arr = new int[nums.length*2];
        
        for(int i=0;i<nums.length;i++)
            arr[i]=nums[i];
        
        for(int i=0;i<nums.length;i++)
            arr[nums.length+i]=nums[i];
        
         Stack<Integer> st = new Stack<Integer>();
       
       int[] res= new int[nums.length];
       for(int i=0;i<nums.length;i++)
       res[i]=-1;
       
       for(int i=arr.length-1;i>=0;i--)
       {
         //  if(!st.isEmpty && st.peek()>arr[i])
          //  res[i]=st.peek();
           
           while(!st.isEmpty() && st.peek()<=arr[i])
           {
           st.pop();
           }           
           
           
           if(!st.isEmpty() && i<nums.length)
             res[i]=st.peek();
           st.push(arr[i]);
       }
       
       //am >= tos =>pop  and then push       
      // am <tos => push
      
     return res; 
    }
}