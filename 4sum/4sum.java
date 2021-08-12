class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
   
        Arrays.sort(nums);
       return nsum(4,0,nums,target);
     
        
      
//         for(int i=0;i<nums.length;i++)
//         {
//             for(int j=i+1;j<nums.length;j++)
//             {
//                 List<List<Integer>> ll = twosum(i,j,nums,target-nums[i]-nums[j]);
                
        
//                 if(ll.size()==0)
//                     continue;
                
               
                
//                 for(int k=0;k<ll.size();k++)
//                 {
//                     List<Integer> lk  = ll.get(k);
//                 List<Integer> res = new ArrayList<Integer>();
//                res.add(nums[i]);
//                     res.add(nums[j]);
//                     res.add(lk.get(0));
//                     res.add(lk.get(1));
//               //      Collections.sort(lk);
                    
//                     if(!list.contains(res))
//                 list.add(res);
//                 }
//             }
//         }
        
       
    }
    
    
    public List<List<Integer>> nsum(int n,int i,int[] nums,int target)
    {
      //  System.out.println(n+" "+i+" "+target);
        if(n==2)
        {
           List<List<Integer>> ll =  twosum(i,nums,target);
            return ll;
        }
        
          List<List<Integer>> ans = new ArrayList<List<Integer>>();
                List<List<Integer>> lres = new ArrayList<List<Integer>>();

        for(int k=i;k<nums.length;k++)
        {
       ans =  nsum(n-1,k+1,nums,target-nums[k]);
            
       //     System.out.println(k+" "+ans);
        for(int ind=0;ind<ans.size();ind++)
        {
            List<Integer> lq =  new ArrayList<Integer>();
            lq.add(nums[k]);
            for(int j=0;j<ans.get(ind).size();j++)
            {
                lq.add(ans.get(ind).get(j));
            }
            
            if(!lres.contains(lq))
            lres.add(lq);
        }
        }
        
        return lres;
    }
    
    public List<List<Integer>> twosum(int a,int[] nums,int target)
    {
    //    System.out.println(a+" "+target+"***");
        HashMap<Integer,Integer> h =  new HashMap();
        List<List<Integer>> ll = new ArrayList<List<Integer>>();
        for(int i=a;i<nums.length;i++)
        {
         
            if(h.containsKey(target-nums[i]))
            {
                List<Integer> li = new ArrayList<Integer>();
            
                li.add(target-nums[i]);
                    li.add(nums[i]);
                
                ll.add(li);
               // return ll;
            }
            
            h.put(nums[i],i);
                
        }
    //    System.out.println(ll+" "+target+" "+a+" "+b+" "+h);
        return ll;
    }
    
}