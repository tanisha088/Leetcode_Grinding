class Solution {
    public void nextPermutation(int[] nums) {
        
        int j=nums.length-1;
        
        while(j>0 && nums[j-1]>=nums[j])
            j--;
        
        j=j-1;
        
        if(j==-1 || nums.length==1)
        {
            Arrays.sort(nums);
            return;
        }
        
        int k=j+1;
        
        if(k==nums.length)
        {
            int m = nums[j];
            nums[j]=nums[j-1];
            nums[j-1]=m;
            return;
        }
        
        while(k<nums.length-1 && nums[k+1]>nums[j])
        {    
            k++;
        }
        
         int m = nums[j];
            nums[j]=nums[k];
            nums[k]=m;
        
       
        int end= nums.length-1;
        int st = j+1;
        
        while(st<=end)
        {
            int t = nums[st];
            nums[st] = nums[end];
            nums[end] = t;
            st++;
            end--;
        }
        
        
    }
}

 