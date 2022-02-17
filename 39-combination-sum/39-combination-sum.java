class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        List<List<Integer>> list =  new ArrayList();
        
        Arrays.sort(candidates);
        fn(candidates,target,0,new ArrayList<Integer>(),list,0);
        
      
        return list;
    }
  
    public void fn(int[] candidates,int target,int sum,List<Integer> l1,List<List<Integer>> ans,int j)
    {
        if(sum==target)
        {
            ans.add(new ArrayList<Integer>(l1));
            return;
        }
        
        if(sum>target)
            return;
        
        for(int i=j;i<candidates.length;i++)
        {
            l1.add(candidates[i]);
            
            fn(candidates,target,sum+candidates[i],l1,ans,i);
            
            l1.remove(l1.size()-1);
        }
    }
    
}