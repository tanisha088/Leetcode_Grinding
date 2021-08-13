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
//         int ans=0;
//         int st=0;
//          long mul = 1;
//         for(int i=0;i<nums.length;i++)
//         {
//             mul  = mul*nums[i];
//             while(mul>=k && st<=i)
//             {
//                 mul= mul/nums[st];
//                  st++;
//             }
            
//             ans+=i-st+1;
//           //  System.out.println(st+" "+i+" "+mul);
//         }
       
//         return ans;
        

/*

i=0
st=0

while(prod<k && st<arr.length)
   prod=prod*arr[st++]
   
res=res+st-i;
i=i+1
while(prod>k && i<arr.length)
   prod=prod/i++;

*/
        
        if(k<2)
            return (0);
        
        int end=0;
        int st=0;
        int prod = 1;
        int res=0;
        while(end<nums.length)
        {
            prod = prod * nums[end];
            end++;
            while(prod>=k)
            {
                prod= prod/nums[st];
                st++;
            }
                if(prod<k)
            res = res+ (end-st);
        }
        
        return res;
        
    }
}
        
        /*
        
      10 5 2 6 
      
      +
      
        
        */