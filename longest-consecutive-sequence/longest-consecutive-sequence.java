class Solution {
    public int longestConsecutive(int[] nums) {
//         HashMap<Integer,Integer> h= new HashMap<Integer,Integer>();
//         for(int i=0;i<nums.length;i++)
//             h.put(nums[i],i);
//         int ans=0;
//         for(int i=0;i<nums.length;i++)
//         {
//             if(!h.containsKey(nums[i]-1))
//             {
//                 int st = nums[i]-1;
//                 int el=st+1;
//                 while(h.containsKey(el))
//                 {
//                     el++;
//                 }
//                 ans=Math.max(ans,el-st-1);
//             }
//         }
        
//         return ans;
        
        
        HashMap<Integer,Integer> h = new HashMap();
                HashMap<Integer,Integer> size = new HashMap();

        for(int i:nums)
        {
          if(h.containsKey(i))
              continue;
            if(!h.containsKey(i-1) && !h.containsKey(i+1))
            {
                h.put(i,i);
                size.put(i,1);
            }
            else if(h.containsKey(i-1) && h.containsKey(i+1))
            {
                int m = find(i-1,h);
                int n = find(i+1,h);
                
                h.put(m,n);
                h.put(i,n);
                
                size.put(n,size.get(m)+size.get(n)+1);
            }
            else if(h.containsKey(i-1))
              {  h.put(i,find(i-1,h));  size.put(find(i-1,h),size.get(find(i-1,h))+1);}
            else {h.put(i,find(i+1,h));
                  size.put(find(i+1,h),size.get(find(i+1,h))+1);}
            
          
        }

      
        int max=0;
        for(int v:size.values())
            max=Math.max(v,max);
        
        return max;
    }
    
    public int find(int a,HashMap<Integer,Integer> h)
    {
        if(h.get(a)==a)
            return a;
        
        int m = find(h.get(a),h);
        h.put(a,m);
        
        return m;
    }
}









/*

4 5 7 8 9 6 3 10

4-2
7-2

5-4
7-7
7-8

*/













