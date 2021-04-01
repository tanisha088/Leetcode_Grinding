class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[] ar1= new int[nums.length];
        ar1[0]=1;
        for(int i=1;i<ar1.length;i++)
        {
            ar1[i]=ar1[i-1]*(nums[i-1]);
        }
        
          int k=nums[nums.length-1];
        nums[nums.length-1]=1;
      
        for(int i=nums.length-2;i>=0;i--)
        {
            int j= nums[i];
            nums[i]=nums[i+1]*k;
            k=j;
        }
        
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=ar1[i]*nums[i];
        }
        
        return nums;
    }
    
    
     
}

