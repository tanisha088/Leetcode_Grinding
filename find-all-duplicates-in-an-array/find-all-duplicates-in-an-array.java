class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        
         List<Integer> list=new ArrayList<Integer>();
        
            for(int i=0;i<nums.length;i++)
        {
            if(nums[Math.abs(nums[i])-1]>0)
                nums[Math.abs(nums[i])-1]*=-1;
            else
                 list.add(Math.abs(nums[i]));
        }
        
      
        
        return list;
        
    }
}