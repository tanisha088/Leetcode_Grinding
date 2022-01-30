class Solution {
    public void rotate(int[] nums, int k) {
       
        k%=nums.length;
        rev(nums,nums.length-k-1,0);
        rev(nums,nums.length-1,nums.length-k);
        rev(nums,nums.length-1,0);
        
       
    }
    
    public void rev(int[] nums,int end,int st)
    {
        
        while(st<=end)
        {
            int t = nums[st];
            nums[st] = nums[end];
            nums[end]= t;
            
            st++;
            end--;
        }
        
        
    }
}




















