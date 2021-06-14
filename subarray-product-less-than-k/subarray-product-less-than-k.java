class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        /*
            if (k == 0) return 0;
        int cnt = 0;
        int pro = 1;
        for (int i = 0, j = 0; j < nums.length; j++) {
            pro *= nums[j];
            while (i <= j && pro >= k) {
                pro /= nums[i++];
            }
            cnt += j - i + 1;
        }
        return cnt;        
    */
        
/*
        long[] prod = new long[nums.length];
        prod[0]=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            prod[i]=prod[i-1]*nums[i];
            
     //       System.out.println(prod[i]+"***");
        }
        */
        int ans=0;
        int st=0;
         long mul = 1;
        for(int i=0;i<nums.length;i++)
        {
            mul  = mul*nums[i];
            while(mul>=k && st<=i)
            {
                mul= mul/nums[st];
                 st++;
            }
            
            ans+=i-st+1;
          //  System.out.println(st+" "+i+" "+mul);
        }
       
        return ans;
    }
}