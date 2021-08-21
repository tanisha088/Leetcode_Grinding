class Solution {
    public int minSubArrayLen(int s, int[] nums) {
//         int st=0;
//         int end=0;
//         int res=nums.length;
//         int sum=0;
//         while(end<nums.length)
//         {
//             while(sum<s && end<nums.length)
//             {
//                 sum+=nums[end];
//                 end++;
//             }
            
//             while(sum>=s && st<end)
//             {
//                 res = Math.min(res,end-st);
//                 sum-=nums[st];
//                 st++;
//             }
            
           
//         }
        
//         if(st==0 && end==nums.length && sum<s)
//             return 0;
//         return res;
        
        int st=0;
        int end=0;
        int sum=0;
        int ans=nums.length+1;
        
        while(end<nums.length)
        {
            sum = sum + nums[end];
                //        System.out.println(end+" "+st+" "+s+" "+sum);
            end++;
            while(sum>=s)
            {
                            ans = Math.min(ans,end-st);
                sum=sum-nums[st];
                st++;
            }
//System.out.println(end+" "+st+" "+s+" "+sum);


            

        }
        
        return ans>nums.length?0:ans;
        
    }
}

































