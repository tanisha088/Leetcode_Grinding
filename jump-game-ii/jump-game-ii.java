class Solution {
    public int jump(int[] nums) {
       
        /*
        for(int i=nums.length-2;i>=0;i--)
        {
            int minval=nums.length;
            for(int j=1;j<=nums[i];j++)
            {
                if(j+i>=nums.length-1)
                {
                    minval=1;
                    break;
                }
                minval=Math.min(minval,nums[i+j]+1);
            }
            nums[i]=minval;
        }
        if(nums.length==1)
            return 0;
        return nums[0];
     */
        
      //  GREEDY ::::
        
//         int curmax=0;
//         int nextmax=0;
//         int jump=0;
//         for(int i=0;i<nums.length-1;i++)
//         {
//             nextmax=Math.max(nextmax,nums[i]+i);
//             if(curmax==i)
//             {
//                 curmax=nextmax;
//                 jump++;
//             }
//         }
        
//         return jump;
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
 int curmax=0;
        int totmax=0;
        int count=0;
        int i=0;
        while(true)
        {
            
         //   System.out.println(curmax+" "+totmax+" "+count+" "+i);
            if(curmax>=nums.length-1)
                return count;
            
            if(curmax<i)
            {
                curmax = totmax;
                count++;
            }
            
            totmax = Math.max(totmax,i+nums[i]);
            i++;
        }
        
        
//         2-3-1-1-4
        
//        curmax >= arr.length-1 -> return count
        
//        totmax -> curmax &  count++  
            
//             totmax= update 
        
        
        
    }
}