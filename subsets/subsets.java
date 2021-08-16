class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
    //    List<List<Integer>> arr =  ArrayList<ArrayList<Integer>>();
        
    //    fn(nums,arr,new List<Integer>(),new HashSet<List<Integer>>(),0);
        
        ArrayList<List<Integer>> lists =  new ArrayList<List<Integer>>();
        
         fn(nums,lists,new ArrayList<Integer>(),new HashSet<List<Integer>>(),0);
        lists.add(new ArrayList<Integer>());
        return lists;
    }
    
    public void fn(int[] num,List<List<Integer>> list,List<Integer> res , HashSet<List<Integer>> set,int i)
    {
          if(res.size()>0 && !set.contains(res))
            {
                list.add(new ArrayList<Integer>(res));
            }
      
        
        for(int j=i;j<num.length;j++)
        {
            res.add(num[j]);
            
            fn(num,list,res,set,j+1);
            
            res.remove(res.size()-1);
            
         }
     }
}