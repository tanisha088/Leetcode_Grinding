class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
//        HashMap<Integer,Integer> h= new HashMap<Integer,Integer>();
//        h.put(0,1);
//         int res=0;
  
        
//         for(int i=0;i<nums.length;i++)
//         {
//             int prev= res;
//             res+=nums[i];
//             int val = res<0? (res%k+k)%k : res%k;
//             int prevv  = prev<0 ? prev%k+k : prev%k;
      
         
//             if(prevv==val && h.get(prevv)==1)
//             {
//                  h.put(val,h.getOrDefault(val,0)+1);
//                 continue;
//             }
        
//             if(h.containsKey(val))
//                 return true;
//             h.put(val,h.getOrDefault(val,0)+1);
//         }
        
//         return false;
        
        // 5 5 5
        
//         3 -10 -7     
        
//         -3 -10 -13    
            
        // a a+5 
        
        HashMap<Integer,Integer> h = new HashMap<Integer,Integer>();
        
        int res=0;
        h.put(0,-1);
        int c=0;
        for(int i:nums)
        {
            res=res+i;
            int val = (res%k+k)%k;
           
          
             if(!h.containsKey(val))
                  h.put(val,c);
            else {
                     int  m =h.get(val);
    
                if(c-m>=2)
                return true;
            }
                
            c++;
        }
        
        return false;
    }
}
