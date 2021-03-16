class Solution {
    public int[] sortedSquares(int[] nums) {
        int i=0;
        int j=nums.length-1;
        int[] arr= new int[nums.length];
        int in=arr.length-1;
        while(i<=j)
        {
            if(Math.abs(nums[i])<Math.abs(nums[j]))
            {
                arr[in]=nums[j]*nums[j];
                in--;
                j--;
            }
            else
            {
                arr[in]=nums[i]*nums[i];
                in--;
                i++;
            }
        }
        
        return arr;
    }
}