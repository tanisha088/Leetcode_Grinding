class Solution {
    public int[] singleNumber(int[] nums) {
       
        int res=0;
        
        for(int i=0;i<nums.length;i++)
        {
          res=res^nums[i];    
        }
        
        int m = res;
        int pl=0;
        while(m!=0)
        {
           
            if((m&1)==1)
             break;
            
 m=m>>1;
                         pl++;

        }
        int ax=0;
        int bx=0;
        for(int num:nums)
        {
             m = (num>>pl & 1);
            if(m==1)
                ax=ax^num;
            else
                bx=bx^num;
            
         //   System.out.println(num+" "+m);
        }
        
        return new int[]{ax,bx};
    }
   
}      