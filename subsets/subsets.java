class Solution {
    
    
    
    public List<List<Integer>> subsets(int[] nums) {
     
       return fn(nums,0);
    }
    
    public List<List<Integer>> fn(int[] nums,int i)
    {
          List<List<Integer>> list=  new ArrayList();
        if(i>nums.length-1)
        {
            List<Integer> l1 =  new ArrayList();
            list.add(l1);
            return list;
        }
        
            List<List<Integer>> ll = fn(nums,i+1);
             
        for(int j=0;j<ll.size();j++)
        {
            List<Integer> l2  = ll.get(j);
    
            List<Integer> cl2 =  new ArrayList<Integer>(l2);
            
           // System.out.println(cl2+" "+l2+ "##");
            
            cl2.add(nums[i]);
            
         //   System.out.println(cl2+ " "+l2 +"****");
            
            list.add(cl2);
            list.add(l2);
        }
        
        return list;
        }
    }


// 3,""
    
// 3 , 23 , "" ,2

// 1,3  123  1  12   