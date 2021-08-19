class Solution {
    public List<List<Integer>> permute(int[] nums) {
        
        List<List<Integer>> res =new ArrayList<List<Integer>>();
        
        fn(nums,res,new ArrayList<Integer>());
        
        return res;
    }
    
    public void fn(int[] nums,List<List<Integer>> res,List<Integer> list)
    {
        
        if(list.size()==nums.length)
        {
            res.add(new ArrayList<Integer>(list));
            return;
        }
        
        for(int i=0;i<nums.length;i++)
        {
            if(list.contains(nums[i]))
                continue;
            
            list.add(nums[i]);
            fn(nums,res,list);
            list.remove(list.size()-1);
        }
    }
}