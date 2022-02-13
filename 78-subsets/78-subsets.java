class Solution {
    
    
    
    public List<List<Integer>> subsets(int[] nums) {
     
        
    List<List<Integer>> list=  new ArrayList();
     
        
        fn(nums,list,new ArrayList<Integer>(),0);
        return list;
    }
    
    public void fn(int[] nums,List<List<Integer>> result,List<Integer> list,int i)
    {
        result.add(new ArrayList<Integer>(list));
        
        for(int j=i;j<nums.length;j++)
        {
            list.add(nums[j]);
            fn(nums,result,list,j+1);
            list.remove(list.size()-1);
        }
        
    }
    
    
    
    }


// 3,""


    
// 3 , 23 , "" ,2

// 1,3  123  1  12   