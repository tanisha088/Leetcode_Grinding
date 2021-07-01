class Solution {
    public int firstMissingPositive(int[] arr) {
     
        /*
        for(int i=0;i<nums.length;i++)
            nums[i] = (nums[i]<=0)?nums.length+2:nums[i];
        
        for(int i=0;i<nums.length;i++)
        {
            if(Math.abs(nums[i])-1<nums.length)
            {
                if(nums[Math.abs(nums[i])-1]>0)
                nums[Math.abs(nums[i])-1]*=-1;
                
            }
        }
        
        for(int i=0;i<nums.length;i++)
            if(nums[i]>0)
                return i+1;
        return nums.length+1;
     */
        
        for(int i=0;i<arr.length;i++)
            if(arr[i]<=0 || arr[i]>arr.length)
                arr[i]=arr.length+2;
        
        for(int i=0;i<arr.length;i++)
        {
            if(Math.abs(arr[i])<=arr.length && arr[Math.abs(arr[i])-1]>0)
            {
                arr[Math.abs(arr[i])-1]=0-arr[Math.abs(arr[i])-1];
            }
        }
        
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>0)
                return i+1;
        }
        return arr.length+1;
      
    }
}

/*

-ve + >arr.length

arr.length+2 






1->arr.length+1

val -> !max && <=arr.length ->arr[val-1] = min

i+1 == max 

-ve -> max


*/























