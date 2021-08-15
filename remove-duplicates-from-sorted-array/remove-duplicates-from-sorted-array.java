class Solution {
    public int removeDuplicates(int[] nums) {
        
        int st=1;
        int end=1;
        
        while(st<nums.length)
        {
            if(nums[st]!=nums[st-1])
            {
              nums[end]=nums[st];
                st++;
                end++;
            }
            else
                st++;
        }
        
        return end;
    }
}

/*
st=2
end=1


1,1,2,2,3,3

*/


