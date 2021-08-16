class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        
        if(nums.length<3)
            return 0;
        
        int st=0;
        int end=2;
        int ans=0;
        int c=1;
         int prev= nums[1]-nums[0];
        
        while(end<nums.length)
        {
            int diff =  nums[end]-nums[end-1] ;

               if( prev!=diff )
                {
                st=end-1;
                prev =diff ;
                c=1;
                }
                else if (end-st+1 >=3)
                {
                ans =ans+c;
                c++;
                }
                end++;
        }
        
        return ans;
    }
    
    /*
      2 4 5 6 8 9 10
      
      prev=2
      c=1
      st=3
      end=4
      ans=1
    */
    
    
    
    
}

