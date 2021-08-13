class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> findSubsequences(int[] nums) {
       
        HashSet<List<Integer>> set = new HashSet();
        res= new ArrayList();
      fn(new ArrayList<Integer>(),nums,0,set);
       return res;
    }
    public void fn(ArrayList<Integer> list, int[] nums,int i,HashSet<List<Integer>> set)
    {
     //   System.out.println(list+" "+i);
        
//         if(i==nums.length)
//         {
//             List<Integer> arl =  new ArrayList<>(list);
            
// //             if(list.size()>0 && list.get(list.size()-1)<=nums[i])
// //                 arl.add(nums[i]);
            
//             if(arl.size()>1 && !res.contains(arl))
//                 res.add(arl);
            
//             return;
                
//         }
        
        for(int q=i;q<nums.length;q++)
        {
            if(list.size()==0 || list.get(list.size()-1)<=nums[q])
            {
                list.add(nums[q]);
              
                if(!set.contains(list) && list.size()>1)
                {
                  List<Integer> app =  new ArrayList<Integer>(list);
                res.add(app);
                
                set.add(app);
                }
                
                fn(list,nums,q+1,set);
                
                list.remove(list.get(list.size()-1));
            }
            
        }
    }
}

