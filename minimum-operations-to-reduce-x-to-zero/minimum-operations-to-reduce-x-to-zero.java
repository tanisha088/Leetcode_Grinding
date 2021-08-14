class Solution {
    public int minOperations(int[] nums, int x) {
        
      int sum=0;
        for(int i:nums)
            sum+=i;
        
        int st=0;
    int tot=0;
        int end=0;
    int lim=-1;
         sum = sum -x;
        while(end<nums.length)
        {
           tot = tot + nums[end];
        
            end++;
            
            while(tot>sum && st<end)
            {
                tot-=nums[st];
                st++;
            }
        //    System.out.println(tot+" "+end+" "+sum);
            if(tot==sum)
            {
                lim = Math.max(lim,end-st);
            }
            
        }
        
        return (lim!=-1)?(nums.length-lim):lim;
        
    }
    
}

/*

1 4 2 2
                  
                  

*/