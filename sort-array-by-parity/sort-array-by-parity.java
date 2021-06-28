class Solution {
    public int[] sortArrayByParity(int[] nums) {
        
        int i=0;
        int j=nums.length-1;
        
        while(i<j)
        {
            if(nums[i]%2==0)
                 i++;
            else if(nums[j]%2!=0)
                j--;
            else
            {
                int t=nums[i];
                nums[i]=nums[j];
                nums[j]=t;
                i++;
                
                j--;
            }
                
        }
        
        return nums;
    }
}