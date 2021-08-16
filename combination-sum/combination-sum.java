class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        Arrays.sort(candidates);
        List<List<Integer>> l = new ArrayList<List<Integer>>();
        
        fn(l,candidates,target,new ArrayList<Integer>(),0);
        
        return l;
    }
    
    public void fn(List<List<Integer>> list,int[] num,int target,List<Integer> res,int i)
    {
             if(target==0)
        {
            list.add(new ArrayList<Integer>(res));
            return;
        }
        
        if(target<num[0])
            return;
        
   
        
        for(int j=i;j<num.length;j++)
        {
            res.add(num[j]);
            fn(list,num,target-num[j],res,j);
            res.remove(res.size()-1);
        }
    }
}