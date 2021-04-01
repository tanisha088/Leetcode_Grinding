class Solution {
    public int dominantIndex(int[] nums) {
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        int in1=-1;
        int in2=-1;
        
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>=max1)
            {
                max2=max1;
                max1=nums[i];
                in1=i;
                in2=in1;
            }
            else if(nums[i]>max2)
            {
                max2=nums[i];
                in2=i;
            }
        }
        System.out.println(max1+" "+max2);
        return (max1>=(2*max2))?in1:-1;
    }
}